package patterns.creationalPatterns.AbstractFactory;

public class SpaceHeroConcreteProduct implements HeroAbstractProduct {
    @Override
    public void getAbiliity() {
        System.out.println("I can move to start!");
    }

    @Override
    public void getLevel() {
        System.out.println("I have 14 lvl");
    }
}
