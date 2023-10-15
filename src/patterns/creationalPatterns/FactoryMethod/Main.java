package patterns.creationalPatterns.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractRewardGenerator generator1 = new GoldGenerator();
        AbstractRewardGenerator generator2 = new GemGenerator();

        List<Reward> rewards = new ArrayList<>();
        rewards.add(generator1.createReward());
        rewards.add(generator1.createReward());
        rewards.add(generator2.createReward());
        rewards.add(generator1.createReward());

        rewards.stream().forEach(Reward::open);
    }
}
