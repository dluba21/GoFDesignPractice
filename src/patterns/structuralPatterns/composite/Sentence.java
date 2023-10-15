package patterns.structuralPatterns.composite;

import java.util.List;

//composite
public class Sentence implements LexicEntity {

    private List<Word> words;
    private String name;

    public Sentence(List<Word> words, String name) {
        this.words = words;
        this.name = name;
    }

    public Sentence(List<Word> words) {
        this.words = words;
    }

    @Override
    public void print() {
        System.out.print("\t\t\t" + name + "\n\t\t\t\t");
        words.stream().forEach(Word::print);
        System.out.println();
    }

    @Override
    public int count() {
        return words.size();
    }

    void addSubObject(Word word) {
        words.add(word);
    }

    void clearWords() {
        words.clear();
    }
}
