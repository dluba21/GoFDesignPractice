package patterns.structuralPatterns.bridge;

public class RedColor implements Color {
    @Override
    public void paint() {
        System.out.print("is red colored");
    }
}
