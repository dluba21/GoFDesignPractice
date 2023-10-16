package patterns.structuralPatterns.facade;

public class Main {
    public static void main(String[] args) {

        final VideoConverterFacade videoConverterFacade = new VideoConverterFacadeImpl();

        final String filename = "Trip_to_Europe.mp4";
        final FormatEnum format = FormatEnum.MP4;

        //one facade method call instead of inlined chain of processing methods
        videoConverterFacade.convertVideo(filename, format);

    }
}
