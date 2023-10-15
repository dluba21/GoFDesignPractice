package patterns.creationalPatterns.AbstractFactory;

public class SpaceChestConcreteProduct implements ChestAbstractProduct{
    @Override
    public String getUrl() {
        return "/spaceChest";
    }

    @Override
    public String getName() {
        return "I am space chest!";
    }
}
