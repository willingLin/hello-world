package com.willing.chapter01_3;

import java.util.Scanner;

/**
 * Created by willingLin on 2016/8/17.
 */

class Node {
    private String string;
    private Node next;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

public class Pratice1_3_18 {

    public static void main(String[] args) {
        Node first = initialNode();
        String lastString = deleteLastNode(first);
        System.out.println(lastString);
    }

    public static Node initialNode() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Strings : ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.setString(str1);
        second.setString(str2);
        third.setString(str3);

        first.setNext(second);
        second.setNext(third);

        return first;
    }

    public static String deleteLastNode(Node first) {

        Node oldFirst = new Node();

        while (first.getNext() != null) {
            oldFirst = first;
            first = first.getNext();
        }
        oldFirst.setNext(null);

        return first.getString();
    }

}
