package oop9.EX2_2;

import java.util.ArrayList;
public class PhoneBookList implements PhoneBook{
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(name)) {
                return  phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getLastName().equals(lastname)) {
                return  phoneBook.get(i);
            }
        }
        return null;
    }



    @Override
    public Student searchByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                return  phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                phoneBook.remove(i);
            }
        }
    }
}

