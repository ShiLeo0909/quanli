package oop11.visitor.computer;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        computer.getComputer();
    }

    @Override
    public void visit(Mouse mouse) {
        mouse.getMouse();
    }

    @Override
    public void visit(Keyboard keyboard) {
        keyboard.getKeyboard();
    }

    @Override
    public void visit(Monitor monitor) {
        monitor.getMonitor();
    }
}
