package patterns.structuralPatterns.composite;

import java.util.List;
//leaf
public class Word implements LexicEntity {

    private String name;

    public Word(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name + " ");
    }

    /* I know that it is not good impl of method
     as OOP rules, but it is just example */
    @Override
    public int count() {
        return 0;
    }

}
