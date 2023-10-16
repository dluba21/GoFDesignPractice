package patterns.structuralPatterns.facade;

import java.util.Arrays;
import java.util.List;

public class VideoConverterFacadeImpl implements VideoConverterFacade {

    final List<PictureProcessor> pictureProcessors = Arrays.asList(
            new MP4PictureProcessorImpl(), new HEICPictureProcessorImpl());
    final CommonSoundProcessor commonSoundProcessor = new CommonSoundProcessorImpl();
    final VideoDAO videoDAO = new VideoDAOImpl();

    @Override
    public void convertVideo(String filename, FormatEnum format) {
        PictureProcessor pictureProcessor = pictureProcessors.stream()
                .filter(v -> v.isApplicable(format))
                .findFirst()
                .orElseThrow();

        pictureProcessor.process(filename);
        commonSoundProcessor.process(filename);
        videoDAO.save(filename);



    }
}
