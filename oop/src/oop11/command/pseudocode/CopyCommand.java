package oop11.command.pseudocode;

public class CopyCommand extends Command{
    private Editor editor;

    public CopyCommand(String app, String editor, Editor editor1) {
        super(app, editor);
        this.editor = editor1;
    }

    @Override
    public void execute() {
        System.out.println("Editor");
    }
}
