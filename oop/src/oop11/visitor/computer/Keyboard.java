package oop11.visitor.computer;

import oop11.visitor.book.Visitor;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
    public void getKeyboard(){
        System.out.println("Keyboard");
    }
}
