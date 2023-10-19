package patterns.structuralPatterns.flyweight;
/*
    mb unlucky example because there additional parameters with flyweight constructors
    Ideally, factory just have to use one object as key like 'symbolFlyweightFactory.getSymbol("B)'
    or compare all parameters to make a new object and create InnerContext for that.

    *update* - used concatination of all parameters as
    strings and passing into key inside factory
 */
public class Main {
    public static void main(String[] args) {
        SymbolFlyweightFactory symbolFlyweightFactory = new SymbolFlyweightFactory();
        symbolFlyweightFactory.getSymbol("B", "Arial", "*A picture*")
         .draw(new SymbolExternalContext(1, 2));
        symbolFlyweightFactory.getSymbol("A", "Dirty", "*A picture*")
                .draw(new SymbolExternalContext(10, 20));
        symbolFlyweightFactory.getSymbol("A", "Romanian", "*A picture*")
                .draw(new SymbolExternalContext(100, 1));
        symbolFlyweightFactory.getSymbol("C", "Black", "*A picture*")
                .draw(new SymbolExternalContext(0, -1));
        symbolFlyweightFactory.getSymbol("A", "Romanian", "*A picture*")
                .draw(new SymbolExternalContext(124, 30));
        symbolFlyweightFactory.getSymbol("A", "Romanian", "*A picture*")
                .draw(new SymbolExternalContext(124, 30));
    }
}
