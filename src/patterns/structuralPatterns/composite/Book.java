package patterns.structuralPatterns.composite;

import java.util.List;

public class Book {
    private List<Page> pages;
    private String name;

    public Book(List<Page> pages, String name) {
        this.pages = pages;
        this.name = name;
    }
}
