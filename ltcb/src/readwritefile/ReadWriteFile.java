package oop.week07;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteFile {

    public static ArrayList<Student> readFileInput(Scanner in) {
        int n = in.nextInt(); // số sinh viên
        ArrayList<Student> students = new ArrayList<>(); // tạo mảng students
        for (int i = 0; i < n; i++) { // nhập lần lượt n sinh viên
            in.nextLine();
            String firstName = in.nextLine(); // nextLine() đọc cả dòng
            String lastName = in.nextLine();
            String address = in.nextLine();
            double score = in.nextDouble(); // nextDouble() đọc số thực
            students.add(new Student(firstName, lastName, address, score));
        }
        return students;
    }

    public static void writeToFile(ArrayList<Student> students, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            for (int i = 0; i < students.size(); i++) {
                fileWriter.write(students.get(i) + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        // lỗi ko tồn tại file
        try {
            Scanner in = new Scanner(new File("src/oop/week07/data.txt"));
            ArrayList<Student> students = readFileInput(in);
            writeToFile(students, "src/oop/week07/output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
