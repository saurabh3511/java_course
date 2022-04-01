package project;

import java.util.ArrayList;
import java.util.Scanner;

public class proj04_3_parallel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for(int i=0;i<5;i++){
        System.out.println("Enter the name");
        String name = sc.next();
        names.add(name);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        ages.add(age);
        }
        System.out.println(" name        age ");
        for(int i=0; i<5;i++){
            System.out.println(names.get(i)+" : "+ ages.get(i));
        }
    }
}
