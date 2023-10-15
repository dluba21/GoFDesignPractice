package patterns.structuralPatterns.decorator;

public class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "This is pepperoni pizza";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
