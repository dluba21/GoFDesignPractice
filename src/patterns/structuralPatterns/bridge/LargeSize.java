package patterns.structuralPatterns.bridge;

public class LargeSize implements Size {
    @Override
    public void printSize() {
        System.out.print("is large sized");
    }
}
