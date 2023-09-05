package EX2_1;

import EX1_5.Mammal;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        begin = begin;
        this.end = end;
    }
    public Line(int beginX ,int beginY , int endX , int endY ){
        begin = new Point(beginX, beginY);
        end = new Point(endX , endY);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }
    public int getBeginX(){
        return end.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public void setBeginX(Point begin){
        this.begin.getX();
    }
    public void setBeginXY(Point begin){
        this.setBeginX(begin);
        this.setBeginY(begin);
    }
    public void setBeginY(Point begin){
        this.begin.getY();
    }
    public void setEndX(Point end){
        this.end.getX();
    }
    public void setEndY(Point end){
        this.end.getY();
    }
    public int getLength(){
        double xDiff = Math.abs(end.getX() - begin.getX());
        double yDiff = Math.abs(end.getY() - begin.getY());
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient(){
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
    return Math.atan2(yDiff , xDiff);
    }
    public String toString(){
        return "Line : begin(" + getBeginX() +"," + getEndX()  + ", end(" +
        getBeginY() + "," +getEndY()+ ")";
    }
}
