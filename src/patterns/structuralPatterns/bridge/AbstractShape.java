package patterns.structuralPatterns.bridge;

public abstract class AbstractShape {
    protected Color color; //<--- обязательно указываем protected
    protected Size size;

    public AbstractShape(Color color, Size size) {
        this.color = color;
        this.size = size;
    }
    public abstract void draw();
}
