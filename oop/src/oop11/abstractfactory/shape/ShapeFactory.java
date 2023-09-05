package oop11.abstractfactory.shape;

public class ShapeFactory implements AbstractFatory {
    @Override
    public Shape getShape(String type) {
        if(type.equals("Rectangle")){
            return new Retangle();
        }
        if(type.equals("Square")){
            return new Square();
        }
        return null;
    }
}
