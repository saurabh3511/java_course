package project;

import java.util.Scanner;

public class proj02_1_AverageOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        int sumOfThree = firstNumber+secondNumber+thirdNumber;
        int Average = sumOfThree/3;
        System.out.println(Average);
    }
}
