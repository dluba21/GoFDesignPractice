package patterns.structuralPatterns.flyweight;

/*
    instead of realisation of many concrete symbols
    with different styles and pictures we create
    singleton object map and get instantiated flyweight object
    with factory method and pass external context to them
 */

/*
    here final makes class not to be inherited,
    based on one of the concepts of this pattern
 */
public final class ConcreteFlyweightSymbol implements FlyweightSymbol {

    /*
        we use final modifier to avoid resetting of inner context,
        this singleton must guarantee immutablness of inner context
     */
    private final String name; //<-- this will be a key in factory's Map
    private final String style;
    private final String picture;


    public ConcreteFlyweightSymbol(final String name, final String style, final String picture) {
        this.name = name;
        this.style = style;
        this.picture = picture;
    }

    @Override
    public void draw(final SymbolExternalContext context) {
        System.out.println(
                String.format("Symbol %s was drawn with picture %s, " +
                "in stype %s with x = %d, y = %d coordinates\n",
                name, picture, style, context.getX(), context.getY())
        );
    }
}
