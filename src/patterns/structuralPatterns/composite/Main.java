package patterns.structuralPatterns.composite;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Mama");
        Word word2 = new Word("Mila");
        Word word3 = new Word("Ramu");

        Word word4 = new Word("Pod");
        Word word5 = new Word("Lezhachiy");
        Word word6 = new Word("Kamen'");
        Word word7 = new Word("Voda");
        Word word8 = new Word("ne");
        Word word9 = new Word("techet");

        Sentence sentence1 = new Sentence(Arrays.asList(word1, word2, word9), "first sentence");
        Sentence sentence2 = new Sentence(Arrays.asList(word3, word4, word5, word9, word7), "second sentence");
        Sentence sentence3 = new Sentence(Arrays.asList(word9, word1, word6, word5), "third sentence");

        Paragraph paragraph1 = new Paragraph(Arrays.asList(sentence1, sentence3), "first paragraph");
        Paragraph paragraph2 = new Paragraph(Arrays.asList(sentence3, sentence2), "second paragraph");

        Page page = new Page(Arrays.asList(paragraph2, paragraph1), "common page");

        page.print();

    }
}
