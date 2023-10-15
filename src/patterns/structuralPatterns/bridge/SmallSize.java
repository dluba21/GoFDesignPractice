package patterns.structuralPatterns.bridge;

public class SmallSize implements Size {
    @Override
    public void printSize() {
        System.out.print("is small sized");
    }
}
