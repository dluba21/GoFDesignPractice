package patterns.structuralPatterns.bridge;

public class YellowColor implements Color {
    @Override
    public void paint() {
        System.out.print("is yellow colored");
    }
}
