package oop11.abstractfactory.shape;

public class RoundedShapeFactory implements AbstractFatory {
    @Override
    public Shape getShape(String type) {
        if(type.equals("RoundedRectangle")){
            return new RoundedRectangle();
        }
        if(type.equals("RoundedSquare")){
            return new RoundedSquare();
        }
        return null;
    }
}
