package patterns.creationalPatterns.AbstractFactory;

public class SpaceConcreteFactory implements GameEventAbstractFactory {
    @Override
    public HeroAbstractProduct getHero() {
        return new SpaceHeroConcreteProduct();
    }

    @Override
    public ChestAbstractProduct getChest() {
        return new SpaceChestConcreteProduct();
    }
}
