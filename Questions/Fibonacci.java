package Questions;

import java.util.Scanner;

//! fibonacci numbers starts from 0 and 1 and series continues by adding previous 2 numbers
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34..... 
// a = 0, b = 1
// 7th fibonacci number = 13
// a ki next value b hojaegi and b ki value a + b ki initial value hojaegi

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = input.nextInt();
        int count = 2;
        //! hamare paas pehle 2 numbers ki value pehle se thi isliye count ki value 2 se start kri hai!

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}