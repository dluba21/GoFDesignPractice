package patterns.creationalPatterns.AbstractFactory;

public class BaseHeroConcreteProduct implements HeroAbstractProduct {
    @Override
    public void getAbiliity() {
        System.out.println("I can not anything");
    }

    @Override
    public void getLevel() {
        System.out.println("I have 1 lvl");
    }
}
