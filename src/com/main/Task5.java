package com.main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int result = 1;

        while (true) {
            System.out.print("Введіть перше число (або 1 для завершення): ");
            int num1 = scanner.nextInt();

            if (num1 == 1) {
                break;
            }

            System.out.print("Введіть друге число: ");
            int num2 = scanner.nextInt();

            result = num1 * num2;
            System.out.println("Результат множення: " + result);
        }
    }
}
