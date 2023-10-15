package patterns.structuralPatterns.composite;

import java.util.List;

//composite
public class Paragraph implements LexicEntity {
    
    private List<Sentence> sentences;

    private String name;

    public Paragraph(List<Sentence> sentences, String name) {
        this.sentences = sentences;
        this.name = name;
    }

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public void print() {
        System.out.println("\t\t" + name + " ");
        sentences.stream().forEach(Sentence::print);
        System.out.println();
    }

    @Override
    public int count() {
        return sentences.size();
    }

    void addSubObject(Sentence sentence) {
        sentences.add(sentence);
    }

    void clearSentences() {
        sentences.clear();
    }
    
}
