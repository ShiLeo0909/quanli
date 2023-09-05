package oop11.visitor.computer;

public class Client {
    public static void main(String[] args) {
        ComputerPart computerPart1 = new Keyboard();
        ComputerPart computerPart2 = new Monitor();
        ComputerPart computerPart3 = new Mouse();
        ComputerPart computerPart4 = new Computer();

        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();

        computerPart1.accept(computerPartDisplayVisitor);
        computerPart2.accept(computerPartDisplayVisitor);
        computerPart3.accept(computerPartDisplayVisitor);
        computerPart4.accept(computerPartDisplayVisitor);

    }
}
