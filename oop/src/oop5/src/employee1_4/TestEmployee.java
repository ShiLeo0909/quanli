package employee1_4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee( 8 , "Peter" , "Tan" , 2500);
        System.out.println(employee);

        employee.setSalary(999);
        System.out.println(employee);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLateName());
        System.out.println(employee.getSalary());

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLateName());
        System.out.println(employee.getAnnualSalary());

        System.out.println(employee.raiseSalary(10));
        System.out.println(employee);


    }
}
