package oop9.EX2_2;

import java.util.HashMap;
public class PhoneBookMap implements PhoneBook{
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student student) {
        if(!phoneBook.containsKey(student.getPhone())){
            phoneBook.put(student.getPhone(),student);
        }
    }

    @Override
    public Student searchByName(String name) {
        for(Student student : phoneBook.values()){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for(Student student : phoneBook.values()){
            if(student.getLastName().equals(lastname)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for(Student student : phoneBook.values()){
            if(student.getPhone().equals(phone)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}

