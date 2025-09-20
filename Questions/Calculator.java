package Questions;

import java.util.Scanner;

//! we have to add a condition to break the while loop

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //! take input from users until they press x or X
        int answer = 0;
        while (true) {
            System.out.print("Enter The Operator: ");
            // take the operator as input
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.print("Enter First Number: ");
                int number1 = input.nextInt();
                System.out.print("Enter Second Number: ");
                int number2 = input.nextInt();

                if(operator == '+'){
                    answer = number1 + number2;
                }

                if (operator == '-') {
                    answer = number1 - number2;
                }

                if (operator == '*') {
                    answer = number1 * number2;
                }

                if (operator == '%') {
                    answer = number1 % number2;
                }

                if (operator == '/') {
                    if (number2 != 0) {
                        answer = number1 / number2;
                    }else{
                        System.out.println("This Operation Is Not Possible!");
                    }
                }

                if (operator != '/') {
                    System.out.println("The Final Answer Is: " + answer);
                }

            }else if(operator == 'x' || operator == 'X'){
                break;
            }else{
                System.out.println("Enter A Valid Operation!");
            }
        }
    }
}