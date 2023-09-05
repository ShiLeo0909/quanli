package oop11.visitor.computer;

import oop11.visitor.book.Visitor;

public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
    public void getMonitor(){
        System.out.println("Monitor");
    }
}
