package patterns.creationalPatterns.FactoryMethod;

public class GemReward implements Reward {
    @Override
    public void open() {
        System.out.println("Opened gem reward! Amazing!");
    }
}
