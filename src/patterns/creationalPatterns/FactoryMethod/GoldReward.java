package patterns.creationalPatterns.FactoryMethod;

public class GoldReward implements Reward {
    @Override
    public void open() {
        System.out.println("Opened gold reward! You are rich now!");
    }
}
