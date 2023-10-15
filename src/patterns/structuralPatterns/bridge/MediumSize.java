package patterns.structuralPatterns.bridge;

public class MediumSize implements Size {
    @Override
    public void printSize() {
        System.out.print("is medium sized");
    }
}
