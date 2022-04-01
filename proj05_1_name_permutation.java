package project;

import java.util.ArrayList;
import java.util.Scanner;

public class proj05_1_name_permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> firstNames =new ArrayList<>();
        ArrayList<String> lastNames =new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("please enter the name");
            String fullName =sc.nextLine();
            int indexOfSpace = fullName.indexOf(" ");
            String firstName = fullName.substring(0,indexOfSpace);
            String lastName =  fullName.substring(indexOfSpace+1);

            firstNames.add(firstName);
            lastNames.add(lastName);

        }
        for(int i=0;i<firstNames.size();i++){
            for(int j=0;j<lastNames.size();j++){
                System.out.println(firstNames.get(i)+" "+lastNames.get(j));
            }
        }
    }
}
