package org.example;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.printf("%d x %d = %d\n", a, i, result);
        }
    }
}
