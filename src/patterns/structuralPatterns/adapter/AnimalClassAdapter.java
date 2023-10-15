package patterns.structuralPatterns.adapter;

public class AnimalClassAdapter extends CatAdaptee implements AnimalTarget {
    @Override
    public void makeNoise() {
        super.meow();
    }
}
