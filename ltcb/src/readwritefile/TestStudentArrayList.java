package oop.week07;

import java.io.FileWriter;
import java.util.Scanner;

public class TestStudentArrayList {
    public static void main(String[] args) {
        StudentArrayList studentArrayList = new StudentArrayList();
        studentArrayList.inputData("src/oop/week07/data.txt");
        try {
            FileWriter fileWriter = new FileWriter("src/oop/week07/student_arraylist.txt");
            studentArrayList.printInformations(fileWriter);
            fileWriter.write("điểm cao nhất: " + studentArrayList.getMaxScore() + "\n");
            fileWriter.write("student có điểm cao nhất: " + studentArrayList.getMaxScoreStudent() + "\n");
            fileWriter.write("điểm thấp nhất: " + studentArrayList.getMinScore() + "\n");
            fileWriter.write("student có điểm thấp nhất: " + studentArrayList.getMinScoreStudent() + "\n");
            fileWriter.write("trung bình: " + studentArrayList.getMeanScore() + "\n");
            fileWriter.write("sap xep:\n");
            studentArrayList.sortByScore();
            studentArrayList.printInformations(fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}