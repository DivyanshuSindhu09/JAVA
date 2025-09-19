import java.util.Scanner;

//! Scanner class is used for taking input and System.in takes keyboard input

public class input {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println(number.nextInt());

        Scanner string = new Scanner(System.in);
        // this will take input until space
        System.out.println(string.next());
        // this will take input until new line
        System.out.println(string.nextLine());
    }
}