package patterns.creationalPatterns.FactoryMethod;

public abstract class AbstractRewardGenerator {
    public void openReward() {
        Reward gameReward = createReward();
        gameReward.open();
    }

    public abstract Reward createReward(); //realize it in child generators (extract constructors to them)
}
