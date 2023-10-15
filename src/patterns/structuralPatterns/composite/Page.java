package patterns.structuralPatterns.composite;

import java.util.List;

//composite
public class Page implements LexicEntity  {

    private List<Paragraph> paragraphs;

    private String name;

    public Page(List<Paragraph> paragraphs, String name) {
        this.paragraphs = paragraphs;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("\t" + name + " ");
        paragraphs.stream().forEach(Paragraph::print);
        System.out.println();
    }

    @Override
    public int count() {
        return paragraphs.size();
    }
    
    void addSubObject(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    void clearParagraphs() {
        paragraphs.clear();
    }
}
