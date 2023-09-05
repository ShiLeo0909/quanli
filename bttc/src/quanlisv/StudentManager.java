package quanlisv;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * StudentManager class
 *
 * @author viettuts.vn
 */
public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private ReadWriteFile readWriteFile;

    /**
     * init StudentDao object and
     * read list student when init StudentManager object
     */
    public StudentManager() {
        readWriteFile = new ReadWriteFile() ;
        studentList = readWriteFile.read();
    }

    /**
     * add student to studentList
     *
     * @param
     */
    public void add() {
        String id = (studentList.size() > 0) ? (String.valueOf(studentList.size() + 1)) : "1";
        System.out.println("student id = " + id);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        String address = scanner.nextLine();
        int gpa = scanner.nextInt();
        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
        readWriteFile.write(studentList);
    }

    /**
     * edit student by id
     *
     * @param id
     */
    public void edit(String id) {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
                studentList.get(i).setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            readWriteFile.write(studentList);
        }
    }

    /**
     * delete student by id
     *
     * @param id: student id
     */
    public void delete(String id) {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            readWriteFile.write(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    /**
     * sort student by name
     */
    public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }

    /**
     * sort student by id
     */
    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }

    /**
     * show list student to screen
     */
    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }

    /**
     * input student id
     *
     * @return student id
     */
    public String inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                String id = scanner.nextLine();
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student name
     *
     * @return student name
     */
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    /**
     * input student address
     *
     * @return student address
     */
    private String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    /**
     * input student age
     *
     * @return student age
     */
    private int inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                int age = Integer.parseInt((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student gpa
     *
     * @return gpa
     */
    private int inputGpa() {
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                int gpa = Integer.parseInt((scanner.nextLine()));
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }

    // getter && setter
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
