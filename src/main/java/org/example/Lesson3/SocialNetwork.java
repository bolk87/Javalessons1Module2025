package org.example.Lesson3;

public class SocialNetwork {
    public static void main(String[] args) {
        //String name = "Михаил";
        User mihail = new User("Михаил","Немишкин", 20, "+795430534534", "mish@google.com");
        System.out.println(mihail.name + " " + mihail.surname + " " + mihail.email + " " + mihail.age + " " + mihail.phone);
        mihail.phone = "123";
        System.out.println(mihail.name + " " + mihail.surname + " " + mihail.email + " " + mihail.age + " " + mihail.phone);
        System.out.println( mihail.email + " " + mihail.email + " " + " " + mihail.email + " ");


//        User alex = new User();
//        alex.name = "Александр";
//        System.out.println(alex.name);
//        alex.age = 35;
//        alex.email = "alex@ya.ru";
//        alex.isOnline = false;
//        System.out.println(alex.name + " " + alex.surname + " " + alex.email);
        User ivan = new User("Имя","Имя", 22, "Имя", "Имя");


        Car car = new Car();
        car.brand = "Mazda";
        car.model = "6";
        car.year = 2024;
        car.price = 3_000_000;
        System.out.println(car.brand + " " + car.model + " " + car.year + " " + car.price);
    }
}
