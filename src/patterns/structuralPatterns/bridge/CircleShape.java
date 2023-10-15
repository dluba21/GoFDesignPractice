package patterns.structuralPatterns.bridge;

import java.sql.SQLOutput;

public class CircleShape extends AbstractShape {
    public CircleShape(Color color, Size size) {
        super(color, size);
    }

    @Override
    public void draw() {
        System.out.print("The circle: ");
        color.paint();
        System.out.print(" ");
        size.printSize();
    }
}
