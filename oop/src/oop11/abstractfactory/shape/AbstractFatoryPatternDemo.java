package oop11.abstractfactory.shape;

public class AbstractFatoryPatternDemo {
    public static void main(String[] args) {
        FatoryProducer fatoryProducer = new FatoryProducer();
        AbstractFatory abstractFatory = fatoryProducer.getAbstractFatory("Shape");
        Shape rectangle = abstractFatory.getShape("Rectangle");
        rectangle.draw();
    }
}
