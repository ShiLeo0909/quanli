package mypoint2_7;
public class MyLine{
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin , MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public MyLine( int x1, int x2 , int y1, int y2){
        begin = new MyPoint(x1 , y1);
        end = new MyPoint(x2 , y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int [] getBeginXY(){
        int []  beginXY = new int [2];
        beginXY [0] = begin.getX();
        beginXY [1] = begin.getY();
        return beginXY;
    }
    public void setBeginXY (int x , int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int [] getEndXY(){
        int [] EndXY = new int [2];
        EndXY [0] = end.getX();
        EndXY [1] = end.getY();
        return EndXY;
    }
    public void setEndXY(int x , int y){
        end.setX(x);
        end.setY(y);
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGredient(){
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff , xDiff);
    }
    public String toString(){
        return "MyLine[begin=(" + begin.getX() + "," + begin.getY() + ") , end =(" + end.getX() + ',' + end.getY() + ")]";
    }
}