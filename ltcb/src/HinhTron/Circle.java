package HinhTron;

public class Circle{
    private double radius=1;
    public  Circle(){

    }
    public  Circle( double ra ){
        this.radius = ra;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {

        return this.radius * 2 * Math.PI ;
    }

    @Override
    public String toString() {
        return "circle[radius="+this.radius+"/" + this.radius+"]";
    }
}