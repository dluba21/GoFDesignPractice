package patterns.structuralPatterns.decorator;

public abstract class AbstractPizzaDecorator implements Pizza {
    protected Pizza pizza; //must be nested abstarct component field

    protected AbstractPizzaDecorator(final Pizza pizza) {
        this.pizza = pizza;
    }

    //todo idk how to use it because it doesn't seen
    protected String getFullDescription() {
        return pizza.getDescription() + "; and it consts " + pizza.getCost() + "dollars";
    }

}
