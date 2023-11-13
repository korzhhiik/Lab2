package com.main;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введіть позитивне число: ");
        int n = scanner.nextInt();
        int sum = 0;

        if (n < 1) {
            System.out.println("Введене число не є позитивним.");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Сума чисел від 1 до " + n + " дорівнює " + sum);
        }
    }
}
