package oop.week07;

// quản lý điểm sinh viên
public class Student {
    private String firstName; // tên
    private String lastName; // họ
    private String address; // địa chỉ
    private double score; // điểm

    public Student(String firstName, String lastName, String address, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student[firstName=" + firstName + ",lastName=" + lastName + ",address=" + address + ",score=" + score + ']';
    }
}
