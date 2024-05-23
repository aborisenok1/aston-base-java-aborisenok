package com.aston.java.lesson_03;

public class __Main__ {
    public static void main(String[] arg) {

        Bear Bear1 = new Bear("Umka", 5);
        Bear Bear2 = new Bear("Timka", 10);
        Bear Bear3 = new Bear("Mansur", 15);
        Bear Bear4 = new Bear("Umka", 5);

        System.out.println(Bear1.equals(Bear4));
    }
}
