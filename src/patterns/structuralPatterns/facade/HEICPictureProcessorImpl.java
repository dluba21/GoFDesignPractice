package patterns.structuralPatterns.facade;

public class HEICPictureProcessorImpl implements PictureProcessor {
    @Override
    public boolean isApplicable(FormatEnum type) {
        return type == FormatEnum.HEIC;
    }

    @Override
    public void process(String filename) {
        System.out.println("HEIC video processing " + filename + " processing is finished!");
    }
}
