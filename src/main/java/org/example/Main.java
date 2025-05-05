package org.example;

public class Main {
    public static void main(String[] args) {

        long balance = 2142141521512515151L;
        System.out.println(balance);
        balance = 1000;
        System.out.println(balance);

        int x = 5;
        System.out.println(x);

        byte y = 1;
        short y2 = 1123;

        double d = 12.5;
        float f = 13.5f;

        char s = 'a';
        String str = "abc";

        System.out.println("Hello world");

        boolean a = true;
        boolean b = false;

        System.out.println(balance/x); // ответ 200
        System.out.println(d*f); // ответ 0.9259259259259259
        System.out.println(s + str); // ответ aabc


        System.out.println(a && b);  //  true && true = true
        System.out.println(a || b);  //  true || true   //    true || false    //      false || true

        System.out.println("Привет \nПривет! \nПока");

        int myBalance = 100;

        String name = "Семён";
        String name2 = name.toLowerCase();

        System.out.println(name2);
    }
}


