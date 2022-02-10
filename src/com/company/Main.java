package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        String[] split = line.split("[\\s:]");
        int count = 0;
        for (String s : split) {
            if (s.length() % 2 == 0) {
                System.out.println(s.substring(0, s.length() - 2));
                break;
            }else{
                System.out.println(s.substring(s.length()/2 - 1, s.length()/2+2));
             }
        }
        System.out.println(count);
    }
}