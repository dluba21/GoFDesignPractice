package patterns.structuralPatterns.adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DogTargetImpl dogTarget = new DogTargetImpl();
        CatAdaptee catAdaptee = new CatAdaptee();

        AnimalObjectAdapter animalObjectAdapter = new AnimalObjectAdapter(catAdaptee);
        List<AnimalTarget> animalTargets_1 = Arrays.asList(dogTarget, animalObjectAdapter);
        animalTargets_1.stream().forEach(AnimalTarget::makeNoise);

        AnimalClassAdapter animalClassAdapter = new AnimalClassAdapter();
        List<AnimalTarget> animalTargets_2 = Arrays.asList(dogTarget, animalClassAdapter);
        animalTargets_2.stream().forEach(AnimalTarget::makeNoise);
    }
}
