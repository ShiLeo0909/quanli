package EX1_2;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("People " , "Hn");
        System.out.println(person.getAddress());
        System.out.println(person.getNamre());

        Student student = new Student("Kaka" , "Vinh" ,"K" , 2004 , 5000);
        System.out.println(student.toString());
        System.out.println(student.getFee());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        student.setYear(1999);
        student.setFee(10000);
        System.out.println(student.toString());

        Staff staff = new Staff("Marco" , "HCM" , "THPT NGO QUYEN" , 1000);
        System.out.println(staff);
        System.out.println(staff.getPay());
        System.out.println(staff.getSchool());
        System.out.println(staff.getNamre());
        staff.setPay(9999);
        staff.setSchool("DHQGHN");
        staff.setNamre("MoMo");
        System.out.println(staff.toString());
    }
}
