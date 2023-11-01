package patterns.behavioralPatterns.command;

import java.util.List;

//invoker class
public class Application {
    private String clipboard;
    private List<Editor> editors;
    private Editor currentEditor;
    private CommandHistory commandHistory;
}
