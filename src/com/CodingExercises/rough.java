package com.CodingExercises;

import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=2; i<num/2; i++){
            if(num % i == 0){
                System.out.println("not prime");
            }else{
                System.out.println("is prime");
            }
        }
    }
}
