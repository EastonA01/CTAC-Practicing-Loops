package org.example;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int n = in.nextInt();
            if(n > 0){
                System.out.println("Number is " + n);
            }
            else if(n < 0){
               System.out.println("Number must be a positive number");
            }
            else {
                break;
            }
        }
    }
}
