package patterns.structuralPatterns.facade;

public class CommonSoundProcessorImpl implements CommonSoundProcessor {
    @Override
    public void process(String filename) {
        System.out.println("Sound processing of " + filename + " has finished!");
    }
}
