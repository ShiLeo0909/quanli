package oop11.visitor.computer;

import oop11.visitor.book.Visitor;

public class Computer implements ComputerPart{
    ComputerPart [] Parts;

    public Computer(ComputerPart [] parts) {
        Parts = parts;
    }

    public Computer() {
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
    public void getComputer(){
        System.out.println("Computer");
    }
}
