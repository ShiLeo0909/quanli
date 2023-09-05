package bank;

public class Account<T> {
    private T id;
    private T name;
    private T numberPhone;
    private T gender;

    public Account(T id, T name, T numberPhone, T gender) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    public T getId() {
        return id;
    }

    public T getName() {
        return name;
    }

    public T getNumberPhone() {
        return numberPhone;
    }

    public T getGender() {
        return gender;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setNumberPhone(T numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }
}
