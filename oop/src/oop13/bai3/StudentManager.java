package oop13.bai3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
        /* TODO */
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        studentList.add(student);
        /* TODO */
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        studentList.add(index,student);
        /* TODO */
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        studentList.remove(index);
        /* TODO */
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        studentList.remove(student);
        /* TODO */
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        return studentList.get(index);
        /* TODO */
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     * @return
     */
    public List<Student> sortYearOfBirthIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return left.getYearOfBirth() - right.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return right.getYearOfBirth() - left.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getMathsGrade() > right.getMathsGrade()) {
                    return 1;
                } else if (left.getMathsGrade() < right.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getMathsGrade() > left.getMathsGrade()) {
                    return 1;
                } else if (right.getMathsGrade() < left.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getPhysicsGrade() > right.getPhysicsGrade()) {
                    return 1;
                } else if (left.getPhysicsGrade() < right.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getPhysicsGrade() > left.getPhysicsGrade()) {
                    return 1;
                } else if (right.getPhysicsGrade() < left.getPhysicsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getChemistryGrade() > right.getChemistryGrade()) {
                    return 1;
                } else if (left.getChemistryGrade() < right.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */

    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getChemistryGrade() > left.getChemistryGrade()) {
                    return 1;
                } else if (right.getChemistryGrade() < left.getChemistryGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getAverageGrade() > right.getAverageGrade()) {
                    return 1;
                } else if (left.getAverageGrade() < right.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getAverageGrade() > left.getAverageGrade()) {
                    return 1;
                } else if (right.getAverageGrade() < left.getAverageGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortPhysicsGradeDecreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortPhysicsGradeIncreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortMathsGradeDecreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortMathsGradeIncreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortChemistryGradeDecreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortChemistryGradeIncreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
        /* TODO */
    }
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortAverageGradeIncreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
    }
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        List<Student> list = new LinkedList<>(sortAverageGradeDecreasing());
        List<Student> newList = new LinkedList<>();
        for (int i = 0 ; i < howMany ; i++) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }

}
