package oop11.visitor.computer;

import oop11.visitor.book.Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor v);
}
