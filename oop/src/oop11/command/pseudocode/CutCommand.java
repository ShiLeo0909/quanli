package oop11.command.pseudocode;

public class CutCommand extends Command{
    private Command command;

    public CutCommand(String app, String editor, Command command) {
        super(app, editor);
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Cut");
    }
}
