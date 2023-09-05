package oop.week07;

import java.io.FileWriter;
import java.util.Scanner;

public class TestStudentArray {
    public static void main(String[] args) {
        StudentArray studentArray = new StudentArray();
        studentArray.inputData("src/oop/week07/data.txt");
        try {
            FileWriter fileWriter = new FileWriter("src/oop/week07/student_array.txt");
            studentArray.printInformations(fileWriter);
            fileWriter.write("điểm cao nhất: " + studentArray.getMaxScore() + "\n");
            fileWriter.write("student có điểm cao nhất: " + studentArray.getMaxScoreStudent() + "\n");
            fileWriter.write("điểm thấp nhất: " + studentArray.getMinScore() + "\n");
            fileWriter.write("student có điểm thấp nhất: " + studentArray.getMinScoreStudent() + "\n");
            fileWriter.write("trung bình: " + studentArray.getMeanScore() + "\n");
            fileWriter.write("sap xep:\n");
            studentArray.sortByScore();
            studentArray.printInformations(fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
