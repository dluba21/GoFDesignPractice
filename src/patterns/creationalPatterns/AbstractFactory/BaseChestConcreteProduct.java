package patterns.creationalPatterns.AbstractFactory;

public class BaseChestConcreteProduct implements ChestAbstractProduct {
    @Override
    public String getUrl() {
        return "/BaseChest";
    }

    @Override
    public String getName() {
        return "This is base chest!";
    }
}
