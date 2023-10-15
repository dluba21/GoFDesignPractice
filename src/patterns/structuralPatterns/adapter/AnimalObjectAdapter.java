package patterns.structuralPatterns.adapter;

public class AnimalObjectAdapter implements AnimalTarget {
    //agregation
    private CatAdaptee catAdaptee;

    public AnimalObjectAdapter(CatAdaptee catAdaptee) {
        this.catAdaptee = catAdaptee;
    }

    @Override
    public void makeNoise() {
        catAdaptee.meow();
    }
}
