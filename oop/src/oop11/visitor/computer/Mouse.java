package oop11.visitor.computer;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor c) {
        c.visit(this);
    }
    public void getMouse(){
        System.out.println("Mouse");
    }
}
