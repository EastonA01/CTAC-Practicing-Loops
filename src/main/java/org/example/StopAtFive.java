package org.example;
import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Give a number: ");
            int n = sc.nextInt();
            if(n == 5){
                break;
            }
        }
    }
}
