package patterns.structuralPatterns.decorator;

//class that reduces functionality
public class NoCheesePizzaDecorator extends AbstractPizzaDecorator {
    public NoCheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() { //remove chees
        return pizza.getDescription().replace(" with cheese", "");
    }

    @Override
    public Double getCost() {
        return pizza.getCost() - 10.0;
    }
}
