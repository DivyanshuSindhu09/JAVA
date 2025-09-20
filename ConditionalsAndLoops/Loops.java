package ConditionalsAndLoops;

import java.util.Scanner;
//? jab pta na ho ki loop kab tak run krega toh use kro while loop
//? jab pta ho ki loop kab tak run krega toh use kro for loop 

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //! print numbers from 1 to 5
        for(int count = 1; count <= 5; count++){
            System.out.println(count);
        }

        //! print numbers from 1 to n
        int n = input.nextInt();
        int count = 0;
        while (count < n) {
            count++; 
            System.out.println(count);
        }

        /*
         do{
         }while()
         the loop will run at least once
        */
        int x = 5;
        do {
            x++;
            System.out.println(x); //! 6
        } while (x < 5);
    }
}