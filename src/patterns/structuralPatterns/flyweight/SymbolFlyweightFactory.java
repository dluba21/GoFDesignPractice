package patterns.structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SymbolFlyweightFactory {
    private final Map<String, FlyweightSymbol> symbolMap = new HashMap<>();

    /*
        Signleton flywight Map. But here is limited list of
        symbols based only with name of symbol. That's why
        we have to be careful to add new symbols maybe to
        have different styles with that letter, it just would
        be replaced
     */
    public FlyweightSymbol getSymbol(final String key, final String style, final String picture) {
        final String wholeKey = key + style + picture;
        if (symbolMap.get(wholeKey) == null) {
            symbolMap.put(wholeKey, new ConcreteFlyweightSymbol(key, style, picture));
            System.out.println("(new object of symbol [" + key + "] is created)");
        }
        else {
            System.out.println("(object of symbol [" + key + "] already exists)");
        }
        return symbolMap.get(wholeKey);
    }
}
