package thithu;
public class NewBook {
    private String id;
    private String name;
    private String author;
    private int cost;
    private double percent;
    public NewBook(String id , String name , String author , int cost , double percent){
        this.id=id;
        this.name=name;
        this.author=author;
        this.cost=cost;
        this.percent=percent;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getCost(){
        return this.cost;
    }
    public double getPercent(){
        return this.percent;
    }
    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.author + "," + this.cost + "," + this.percent + " phan tram";
    }
}
