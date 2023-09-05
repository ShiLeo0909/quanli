package employee1_4;

public class Employee {
    private int id;
    private String firstName;
    private String lateName;
    private int salary;

    public Employee(){

    }
    public Employee(int id, String firstName, String lateName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lateName = lateName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLateName() {
        return lateName;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLateName(String lateName) {
        this.lateName = lateName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return percent / 100 * salary;
    }

    public String toString() {
        return "Emplayee[id =" + id + ",name="
                + firstName + lateName +
                ",salary=" + salary + "]";
    }
}
