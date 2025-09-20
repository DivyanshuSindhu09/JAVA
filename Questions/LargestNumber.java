package Questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largestNumber = a;
        
        if(b > a){
            largestNumber = b;
        }

        if (c > b) {
            largestNumber = c;
        }

        System.out.println("Largest Number Is " + largestNumber);

        int maxNumber = Math.max(50, Math.max(19, 69));
        System.out.println(maxNumber); //69
    }
}