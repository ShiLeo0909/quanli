package EX2_2;


public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public double Volume(Circle base , double height){
        return height * base.getArea();
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
