package oop.week07;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StudentArray {
    private Student[] students; // mảng các Student

    public void inputData(String path) {
        try {
            Scanner in = new Scanner(new File(path));
            int n = in.nextInt(); // số sinh viên
            students = new Student[n]; // tạo mảng students
            for (int i = 0; i < n; i++) { // nhập lần lượt n sinh viên
                in.nextLine();
                String firstName = in.nextLine(); // nextLine() đọc cả dòng
                String lastName = in.nextLine();
                String address = in.nextLine();
                double score = in.nextDouble(); // nextDouble() đọc số thực
                students[i] = new Student(firstName, lastName, address, score);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // in thông tin mỗi sv trên 1 dòng
    public void printInformations(FileWriter fileWriter) {
        try {
            for (int i = 0; i < students.length; i++) {
                fileWriter.write(students[i] + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        for (Student student : students) {
//            System.out.println(student);
//        }
    }

    // trả về điểm cao nhất
    public double getMaxScore() {
        double max = students[0].getScore();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getScore() > max) {
                max = students[i].getScore();
            }
        }
//        for (Student student : students) {
//            if (student.getScore() > max) {
//                max = student.getScore();
//            }
//        }
        return max;
    }

    // Trần Thanh Lâm 22001606 2đ
    public double getMeanScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        return sum / students.length;
    }

    public double getMinScore() {
        double min = students[0].getScore();
        for (Student student : students) {
            if (student.getScore() < min) {
                min = student.getScore();
            }
        }
        return min;
    }

    public Student getMinScoreStudent() {
        double min = getMinScore();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() == min) {
                return students[i];
            }
        }
        return null;
    }

    // trả về sinh viên có điểm cao nhất đầu tiên
    public Student getMaxScoreStudent() {
        double max = getMaxScore();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getScore() == max) {
                return students[i];
            }
        }
//        for (Student student : students) {
//            if (student.getScore() == max) {
//                return student;
//            }
//        }
        return null;
    }

    // sắp xếp theo điểm tăng dần
    public void sortByScore() {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getScore() > students[j].getScore()) {
                    Student student = students[i];
                    students[i] = students[j];
                    students[j] = student;
                }
            }
        }
    }
}
