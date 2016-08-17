package com.willing.chapter01_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by willingLin on 2016/8/17.
 * Pratice1_3_15
 */
public class Pratice1_3_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int k = scanner.nextInt();

        Queue<String> queue = new LinkedList<String>();
        System.out.println("Enter " + k + " Strings:");
        for(int i = 0; i < k + (new Random().nextInt(3)+1); i++) {
            queue.add(scanner.next());
        }
        for (String temp: queue) {
            System.out.print(temp + "  ");
        }
        System.out.println();
        for(int j = 0; j < queue.size(); j++) {
            String str = queue.poll();
            if(j == k-1) {
                System.out.println(str);
            }
        }

    }

}
