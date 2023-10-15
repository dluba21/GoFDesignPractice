package patterns.structuralPatterns.decorator;

//class that extends functionality
public class MeatPizzaDecorator extends AbstractPizzaDecorator {

    public MeatPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with meat";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 20.0;
    }
}
