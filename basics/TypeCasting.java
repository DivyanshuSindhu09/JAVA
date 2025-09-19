import java.util.Scanner;

//! when one type of data is assigned to another type of variable, an automatic type conversion will take place if the following conditions are met ->

//! byte -> short -> char -> int -> long -> float -> double

//! all the bytes, short and char are converted to int when used in any expression
//! if one of the operands is long, the whole expression will be promoted to long
//! if one of the operands is float, the whole expression will be promoted to float
//! if one of the operands is double, the whole expression will be promoted to double


//? 1. the two types are compatible
//? 2. the destination type is larger than the source type 
//? 3. you are asking for lager and giving smaller

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float integer = input.nextFloat();
        System.out.println(integer);
        //  70 -> 70.0
        // int -> float

        //! to convert float into integer
        //? narrowing type casting
        int num = (int) (69.69f);
        System.out.println(num); // 69

        //! autonatic type promotion in expressions

        // byte -> 256

        int a = 257;
        byte b = (byte) (a);
        System.out.println(b); // 257 % 256 = 1

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e; // 40 * 50 / 100
        System.out.println(f); // 20    
        //! the expression is evaluated in int even though all the variables are of byte type

        int ascii = 'D';
        System.out.println(ascii); //68

        //! java follows unicode system

        byte b1 = 5;
        char ch = 'a';
        short s = 102;
        int i = 50000;
        float f1 = 5.67f;
        double d1 = .1234;
        double result = (f1 * b1) + (i / ch) - (d1 * s);
        // float * byte -> float
        // int / char -> int
        // double * short -> double
        // float + int -> float
        // float - double -> double
        // float + int - double -> double
        System.out.println((f1 * b1) + " " + (i / ch) + " " + (d1 * s)); //28.35 515 12.5868
        System.out.println(result); //530.7631755859375
    }
}