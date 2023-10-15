package patterns.structuralPatterns.bridge;

import java.awt.*;

public class TriangleShape extends AbstractShape {
    public TriangleShape(Color color, Size size) {
        super(color, size);
    }

    @Override
    public void draw() {
        System.out.print("The triangle: ");
        color.paint();
        System.out.print(" ");
        size.printSize();
        System.out.println("");
    }
}
