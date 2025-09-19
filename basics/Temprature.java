import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Temprature In C: ");
        float Celsius = input.nextFloat();
        float Fahrenheit = (Celsius * 9/5) + 32;
        System.out.print("Temprature in Fahrenheit: " + Fahrenheit);
    }
}