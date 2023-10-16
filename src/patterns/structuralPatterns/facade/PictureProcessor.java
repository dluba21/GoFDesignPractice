package patterns.structuralPatterns.facade;

public interface PictureProcessor {
    boolean isApplicable(FormatEnum type);

    void process(String filename);
}
