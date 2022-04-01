package project;

import java.util.ArrayList;
import java.util.Scanner;

public class proj04_2_Working_with_ArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>  non_negative = new ArrayList<>();
        boolean input = true;
        while(input){
            System.out.print(" enter a number");
            int input_integer = sc.nextInt();
            if(input_integer<0){
                input=false;
            }else non_negative.add(input_integer);
        }

        for(int i=non_negative.size()-1;i>=0;i--){
            System.out.println(non_negative.get(i));
        }
    }
}
