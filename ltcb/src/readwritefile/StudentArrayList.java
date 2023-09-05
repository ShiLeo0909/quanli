package oop.week07;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Phạm Gia Nguyên 22001626
public class StudentArrayList {
    private ArrayList<Student> students; // mảng các Student

    public void inputData(String path) {
        try {
            Scanner in = new Scanner(new File(path));
            int n = in.nextInt();
            students = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                in.nextLine();
                String firstName = in.nextLine();
                String lastName = in.nextLine();
                String address = in.nextLine();
                double score = in.nextDouble();
                students.add(new Student(firstName, lastName, address, score));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // in thông tin mỗi sv trên 1 dòng
    public void printInformations(FileWriter fileWriter) {
        try {
            for (int i = 0; i < students.size(); i++) {
                fileWriter.write(students.get(i) + "\n");
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
        double max = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++) {
            if (max < students.get(i).getScore()) {
                max = students.get(i).getScore();
            }
        }
//        for (Student student : students) {
//            if (student.getScore() > max) {
//                max = student.getScore();
//            }
//        }
        return max;
    }

    public double getMeanScore() {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getScore();
        }
        return sum / students.size();
    }

    public double getMinScore() {
        double min = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++) {
            if (min > students.get(i).getScore()) {
                min = students.get(i).getScore();
            }
        }
        return min;
    }

    public Student getMinScoreStudent() {
        double min = getMinScore();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() == min) {
                return students.get(i);
            }
        }
        return null;
    }

    // trả về sinh viên có điểm cao nhất đầu tiên
    public Student getMaxScoreStudent() {
        double max = getMaxScore();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getScore() == max) {
                return students.get(i);
            }
        }
        return null;
    }

    // sắp xếp theo điểm tăng dần
    public void sortByScore() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getScore() > students.get(j).getScore()) {
                    Student student = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, student);
                }
            }
        }
    }
}
