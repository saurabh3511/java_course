package project;

import java.util.Scanner;

public class proj04_1_Working_with_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int integerArray[] = new int[5];
        for(int i=0;i<5;i++) {
            System.out.println("enter an integer ");
            integerArray[i] = sc.nextInt();
        }

        for(int j=0;j<5;j++){
            System.out.println("result is "+ integerArray[j]*2);
        }
    }
}

