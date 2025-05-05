package org.example.Lesson3;

public class User {
    String name;
    String surname;
    int age;
    String phone;
    String email;
    boolean isOnline;

    public User(String myName, String mySurname, int myAge, String myPhone, String myEmail) {
        name = myName;
        surname = mySurname;
        age = myAge;
        phone = myPhone;
        email = myEmail;
        isOnline = false;
    }
}
