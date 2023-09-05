package oop9.EX2_2;

public class TestMain {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastName("Poppi"));

        System.out.println(pb.searchByNumber("1111"));

        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastName("Poppi"));

        PhoneBook pb2 = new PhoneBookList();
        ;
        pb2.addPerson(new Student("Nicola", "Bicocchi", "12423"));
        pb2.addPerson(new Student("Marco", "Rizzo", "24564"));
        pb2.addPerson(new Student("Luisa", "Poppi", "74923"));

        System.out.println(pb2.searchByName("Nicola"));
        System.out.println(pb2.searchByNumber("74923"));
        System.out.println(pb2.searchByLastName("Rizzo"));

        pb2.deleteByNumber("12423");
        System.out.println(pb2.searchByName("Nicola"));
    }
}
