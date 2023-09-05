package oop9.EX2_1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastnam;
    private String phone;
    private double average;

    public Student(String name, String lastnam, String phone) {
        this.name = name;
        this.lastnam = lastnam;
        this.phone = phone;
    }

    public Student(String name, String lastnam, double average) {
        this.name = name;
        this.lastnam = lastnam;
        this.average = average;
    }

    public Student(String name, String lastnam, String phone, double average) {
        this.name = name;
        this.lastnam = lastnam;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student o) {
        if (this.average < o.average) {
            return -1;
        } else if (this.average > o.average) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastnam, student.lastnam)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastnam , phone , average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastnam='" + lastnam + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                '}';
    }
}
