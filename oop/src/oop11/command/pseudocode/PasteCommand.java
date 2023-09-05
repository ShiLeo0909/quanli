package oop11.command.pseudocode;

public class PasteCommand extends Command{
    private Command command;

    public PasteCommand(String app, String editor, Command command) {
        super(app, editor);
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Paste");
    }
}
