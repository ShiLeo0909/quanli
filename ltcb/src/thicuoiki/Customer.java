package thicuoiki;

import java.util.ArrayList;

public class Customer {
    private String id;
    private String name;
    private String birthday;
    private String address;
    private String gender;
    private double score;
    private ArrayList<String> shoesIds;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
    public Customer(String id , String name , String birthday, String address , String gender , double score , ArrayList<String > shoesIddds){
        this.id = id;
        this.name = name ;
        this.birthday=birthday;
        this.address = address;
        this.gender = gender;
        this.score = score;
        this.shoesIds=shoesIds;
    }

    public ArrayList<String> getShoesIds() {
        return shoesIds;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public void setShoesIds(ArrayList<String> shoesIds) {
        this.shoesIds = shoesIds;
    }

    @Override
    public String toString() {
        return "Customer[id=" + id + ",name=" + name + ",birthday=" + birthday + ",address=" + address + ",gender=" + gender + ",score=" + score + ",shoesIds=" + shoesIds + ']';
    }

}
