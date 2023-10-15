package patterns.creationalPatterns.FactoryMethod;

public class GoldGenerator extends AbstractRewardGenerator {
    @Override
    public Reward createReward() {
        return new GoldReward();
    }
}
