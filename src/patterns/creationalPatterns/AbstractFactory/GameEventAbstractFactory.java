package patterns.creationalPatterns.AbstractFactory;

public interface GameEventAbstractFactory {
    HeroAbstractProduct getHero();
    ChestAbstractProduct getChest();
}
