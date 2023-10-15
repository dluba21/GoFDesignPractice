package patterns.creationalPatterns.AbstractFactory;

//entity for game in Main.java, it is important class
public class GameApplication {
    private ChestAbstractProduct chestAbstractProduct;
    private HeroAbstractProduct heroAbstractProduct;

    public GameApplication(GameEventAbstractFactory gameEventAbstractFactory) {
        this.chestAbstractProduct = gameEventAbstractFactory.getChest();
        this.heroAbstractProduct = gameEventAbstractFactory.getHero();
    }

    public void printParameters() {
        System.out.print("Hero parameters: ");
        heroAbstractProduct.getAbiliity();
        heroAbstractProduct.getLevel();

        System.out.print(String.format("Chest parameters: %s, %s",
                chestAbstractProduct.getName(), chestAbstractProduct.getUrl()));
    }

    public ChestAbstractProduct getChestAbstractProduct() {
        return chestAbstractProduct;
    }

    public void setChestAbstractProduct(ChestAbstractProduct chestAbstractProduct) {
        this.chestAbstractProduct = chestAbstractProduct;
    }

    public HeroAbstractProduct getHeroAbstractProduct() {
        return heroAbstractProduct;
    }

    public void setHeroAbstractProduct(HeroAbstractProduct heroAbstractProduct) {
        this.heroAbstractProduct = heroAbstractProduct;
    }
}
