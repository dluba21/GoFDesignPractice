package patterns.structuralPatterns.facade;

public class MP4PictureProcessorImpl implements PictureProcessor {
    @Override
    public boolean isApplicable(FormatEnum type) {
        return type == FormatEnum.MP4;
    }

    @Override
    public void process(String filename) {
        System.out.println("MP4 video processing " + filename + " processing is finished!");
    }
}
