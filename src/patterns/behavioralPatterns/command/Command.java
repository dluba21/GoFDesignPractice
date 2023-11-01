package patterns.behavioralPatterns.command;

public abstract class Command {

    protected Application application;
    protected Editor editor;
    protected String backup; //<-- field to save text

    public void saveBackup() {
        this.backup = editor.getText();
    }
    public void undo() {
        editor.setText(this.backup);
    }

    public abstract boolean execute(); //<-- returns true if command was success to check if we there is necessity to save it to history
}
