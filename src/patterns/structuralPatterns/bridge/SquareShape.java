package patterns.structuralPatterns.bridge;

public class SquareShape extends AbstractShape {

    public SquareShape(Color color, Size size) {
        super(color, size);
    }

    @Override
    public void draw() {
        System.out.print("The square: ");
        color.paint();
        System.out.print(" ");
        size.printSize();
        System.out.println("");
    }
}
