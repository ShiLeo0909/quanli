package oop9.EX2_2;

import java.util.Objects;
public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private String phone;
    private double average;
    public Student(String name,String lastName,String phone) {
        this.name=name;
        this.lastName=lastName;
        this.phone=phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
    }

    public Student(String name, String lastName, String phone, double average) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(this.average, student.average);
    }
    public int hashCode(){
        return Objects.hash(name,lastName,phone,average);
    }
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Student student = (Student) object;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(phone, student.phone);
    }
    public String toString() {
        return "Student[" + "name='" + name + ", lastname='" + lastName + ", phone='" + phone + ", average=" + average + ']';
    }
}

