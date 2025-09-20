package ConditionalsAndLoops;

public class If {
    public static void main(String[] args) {
        int salary = 40000;

        if(salary > 50000){
            salary += 10000;
        } else{
            salary += 5000;
        }

        System.out.println(salary);

        int marks = 90;

        if(marks >= 90){
            System.out.println("A");
        } else if(marks > 80){
            System.out.println("B");
        } else if(marks > 70){
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }

}

//!PS C:\Users\wel\Desktop\JAVA> javac ConditionalsAndLoops\If.java
//!PS C:\Users\wel\Desktop\JAVA> java ConditionalsAndLoops.If       
//!45000