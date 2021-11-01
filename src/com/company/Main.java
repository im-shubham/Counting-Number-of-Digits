package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,z,count=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");
        n=sc.nextInt();
        z=n;
        while(z>0){
            count+=1;
            z=z/10;

        }
        System.out.println("Number of digit is: "+ count);


    }
}
