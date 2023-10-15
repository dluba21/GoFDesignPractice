package patterns.structuralPatterns.adapter;

public class DogTargetImpl implements AnimalTarget {
    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
