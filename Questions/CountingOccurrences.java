package Questions;

import java.util.Scanner;

//! agar kisi bhi number ka % 10 se kroge toh uska last digit milega
// n % 10 = last digit
// n ka remainder lo 10 se fir check kro ki wo number hume count krna hai ya nhi 
// fir n ko 10 se divide krdo taki last number remove ho jaye and repeat the process

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        // int number = input.nextInt();
        // int lastDigit = number % 10;
        // System.out.println(lastDigit);
        System.out.print("Enter any number: ");
        int principleNumber = input.nextInt();
        System.out.print("Enter the number for which you are going to check: ");     
        int reoccurringNumber = input.nextInt();

        int count = 0;

        while (principleNumber > 0) {
            int remainder = principleNumber % 10;
            if(remainder == reoccurringNumber){
                count++;
            }
            principleNumber = principleNumber / 10; // principleNumber /= 10
        }
        System.out.println(count);
    }
}