package oop11.command.pseudocode;

public abstract class Command {
    private String app;
    private String editor;
    private String backup;

    public Command(String app, String editor) {
        this.app = app;
        this.editor = editor;
    }
    public void saveBackup(){

    }
    public void undo(){

    }
    public abstract void execute();
}
