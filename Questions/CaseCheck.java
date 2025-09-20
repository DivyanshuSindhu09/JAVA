package Questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        //! int ascii = ch; Type conversion from char to ascii
        // System.out.println(ascii);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
        //! these letters are getting converted into their ascii values
    }
}