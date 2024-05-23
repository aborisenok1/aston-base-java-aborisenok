package com.aston.java.lesson_04;

public class __Main__ {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(16);
        myLinkedList.add(27);
        myLinkedList.add(888);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(3));

        myLinkedList.remove(4);
        myLinkedList.add(999);
        System.out.println(myLinkedList);

        MyLinkedList.createLinkedListWithRandomNumbers(5);
        ///
    }
}
