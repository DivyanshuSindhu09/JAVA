package Questions;

import java.util.Scanner;

// n = 23597
// ans = 7 * 10 + 9 = 79
// 79 * 10 + 5 = 795
// 795 * 10 + 3 = 7953
//  7953 * 10 + 2 = 79532 

public class Reversing_A_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int answer = 0;

        while (number > 0) {
            int remainder = number % 10;
            number /= 10;
            answer = answer * 10 + remainder;
        }
        System.out.println(answer);
    }
}