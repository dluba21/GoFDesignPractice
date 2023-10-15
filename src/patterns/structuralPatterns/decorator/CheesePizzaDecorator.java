package patterns.structuralPatterns.decorator;

//class that extends functionality
public class CheesePizzaDecorator extends AbstractPizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 10.0;
    }
}
