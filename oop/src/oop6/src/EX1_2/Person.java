package EX1_2;

public class Person {
    private String namre;
    private String address;

    public Person(String namre, String address) {
        this.namre = namre;
        this.address = address;
    }

    public String getNamre() {
        return namre;
    }

    public String getAddress() {
        return address;
    }

    public void setNamre(String namre) {
        this.namre = namre;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "namre='" + namre + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
