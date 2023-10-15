package patterns.creationalPatterns.AbstractFactory;

public class BaseConcreteFactory implements GameEventAbstractFactory {
    @Override
    public HeroAbstractProduct getHero() {
        return new BaseHeroConcreteProduct();
    }

    @Override
    public ChestAbstractProduct getChest() {
        return new BaseChestConcreteProduct();
    }
}
