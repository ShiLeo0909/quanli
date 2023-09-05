package quanlisv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {

    private static final String STUDENT_FILE_NAME = "D:\\java\\BTTC\\src\\quanlisv\\studentss.txt";

    public List<Student> read() {
        List<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(STUDENT_FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if(parts.length == 5){
                    String id = parts[0].trim();
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    String address = parts[3].trim();
                    int gpa = Integer.parseInt(parts[4].trim());

                    Student student  = new Student(id , name , age , address,gpa);
                    studentList.add(student);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return studentList;
    }
    public void write(List<Student> studentList) {
        try {
            FileWriter fileWriter = new FileWriter(STUDENT_FILE_NAME, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a line to append to the file: ");
            String userInput = scanner.nextLine();

            bufferedWriter.write(userInput);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Line appended successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }
}
