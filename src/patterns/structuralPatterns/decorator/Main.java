package patterns.structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new PepperoniPizza();
        Pizza pizza2 = new VeganPizza();

        pizza1 = new MeatPizzaDecorator(new CheesePizzaDecorator(pizza1));
        System.out.println(pizza1.getDescription() + "; and it costs " + pizza1.getCost() + " dollars");
        pizza1 = new NoCheesePizzaDecorator(pizza1); //<- order of decorators is important,
        // cause i could call for noCheesedocorator before cheeseDecorator and in result it will be with cheese
        System.out.println(pizza1.getDescription() + "; and it costs " + pizza1.getCost() + " dollars");

        pizza2 = new CheesePizzaDecorator(pizza2);
        System.out.println(pizza2.getDescription() + "; and it costs " + pizza1.getCost() + "dollars");
    }


}
