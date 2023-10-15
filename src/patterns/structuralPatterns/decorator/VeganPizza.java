package patterns.structuralPatterns.decorator;

public class VeganPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is vegan pizza";
    }

    @Override
    public Double getCost() {
        return 1.0;
    }
}
