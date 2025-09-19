import java.util.Scanner;

public class InputWithDatatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int number = input.nextInt();
        System.out.println("Your Roll Number is " + number);

        int a = 10;
        //! a -> identifier
        //! 10 -> literal

        int b = 234_000_000;
        //! 234,000,000

        float marks = input.nextFloat(); 
    }
}
