package org.example;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number less than 11 ");
        int n = in.nextInt();
        for (int i = 11; i >= n; n++) {
            System.out.print(n + "\n");
        }
    }
}
