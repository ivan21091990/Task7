package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        int number = scanner.nextInt();

        switch (number) {
            case 15:
            case 30:
            case 45:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;

        }
    }
}
