package patterns.structuralPatterns.bridge;

public class GreenColor implements Color {
    @Override
    public void paint() {
        System.out.print("is green colored");
    }
}
