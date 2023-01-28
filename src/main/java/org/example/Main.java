package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var a = 10;
        int b = 5 + 1;
        Integer c = 6;
//        c.floatValue();
        final int TEST_CONSTANT = 10;
        String latestScoring = "Decline";
//       loverCamelCase - стиль написания составных имен для переменных
        System.out.println(c.floatValue());

        c = (int) 3.2;
        String ten = "10";
        c = Integer.valueOf(ten);
        System.out.println(c);

        for (int i = 1; i < 11; i++) {
            System.out.println("Hello!" + (i * i));
        }
    }

}