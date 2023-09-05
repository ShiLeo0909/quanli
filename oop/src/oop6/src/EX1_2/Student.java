package EX1_2;

public class Student extends Person {
    private String program;
    private int year ;
    private double fee;

    public Student(String namre, String address, String program, int year, double fee) {
        super(namre, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
