package bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        System.out.println("lấy ra id của các sinh viên");
        testOriginalData();
        System.out.println();

        System.out.println(" 4 Sinh viên có điểm trung bình cao nhất");
        testFilterStudentsHighestAverageGrade();
        System.out.println();

        System.out.println("4 Sinh viên có điểm trung bình thấp nhất");
        testFilterStudentsLowestAverageGrade();
        System.out.println();

        System.out.println("5 Sinh viên có điểm toán cao nhất");
        testFilterStudentsHighestMathsGrade();
        System.out.println();

        System.out.println("5 Sinh viên có điểm toán thất nhất");
        testFilterStudentsLowestMathsGrade();
        System.out.println();

        System.out.println("Sinh viên có điểm trung bình tăng dần");
        testSortAverageGradeIncreasing();
        System.out.println();

        System.out.println("Sinh viên có điểm trung bình giam dần");
        testSortAverageGradeDecreasing();
        System.out.println();

        System.out.println("Sinh viên có điểm trung bình nhỏ hơn 4");
        testFilterStudentsLowerThanAverageGrade();
        System.out.println();

        System.out.println("Sinh viên có điểm trung bình lớn hơn 8");
        testFilterStudentsHigherThanAverageGrade();

        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "D:\\java\\oop\\src\\A4\\src\\bai2\\students.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }
                Student newStudent = new Student
                        .StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6))).build();
                StudentManager studentManager = StudentManager.getInstance();
                studentManager.append(newStudent);

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsByIncreasingAverageGrade();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsByDecreasingAverageGrade();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsHighestAverageGrade(4);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsLowestAverageGrade(4);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsHigherThanAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsHigherThanAverageGrade(8);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowerThanAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsLowerThanAverageGrade(4);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }
}
