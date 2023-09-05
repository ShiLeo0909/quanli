package oop11.abstractfactory.shape;

public class FatoryProducer {
    public AbstractFatory getAbstractFatory(String type){
        if(type.equals("Shape")){
            return new ShapeFactory();
        }
        if(type.equals("RoundedShape")){
            return new RoundedShapeFactory();
        }
        return null;
    }
}
