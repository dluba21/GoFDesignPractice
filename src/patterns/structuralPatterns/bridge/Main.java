package patterns.structuralPatterns.bridge;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       AbstractShape squareShape = new SquareShape(new RedColor(), new LargeSize());
       AbstractShape triangleShape = new TriangleShape(new YellowColor(), new MediumSize());
       AbstractShape circleShape = new CircleShape(new GreenColor(), new SmallSize());

       List<AbstractShape> abstractShapeList = Arrays.asList(squareShape, triangleShape, circleShape);

       abstractShapeList.stream().forEach(AbstractShape::draw);

    }
}
