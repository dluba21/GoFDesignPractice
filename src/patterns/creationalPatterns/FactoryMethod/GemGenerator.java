package patterns.creationalPatterns.FactoryMethod;

public class GemGenerator extends AbstractRewardGenerator {
    @Override
    public Reward createReward() {
        return new GemReward();
    }
}
