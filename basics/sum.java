import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        
        int sum = a + b;
        System.out.println("The Sum Is : " + sum);

        //! isme agar input mein string, float doge toh error aaega

        //! agar input ka datatype float hua or tab input mein integer diya toh error nhi aega
    }
}
