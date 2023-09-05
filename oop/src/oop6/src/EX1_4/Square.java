package EX1_4;

public class Square extends Rectangle{

    public Square(){

    }
    public Square(double side){
        super(side , side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled , side , side) ;
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Square[Rectangle[Shape[color=" + getColor() +
                "' filled" + isFilled()+ ",width=" + getWidth() + ",length=" + getWidth() + "]]";
    }
}
