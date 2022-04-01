package project;
import java.util.*;
public class proj02_2_mad_Libs_Clone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the adjective");
        String adjective = sc.next();

        System.out.println("Enter the  girl's name :");
        String girlName = sc.next();

        System.out.println("Enter another adjective : ");
        String adjective2 = sc.next();

        System.out.println("Enter the occupation :");
        String occupation = sc.next();

        System.out.println("Enter the name of place : ");
        String place = sc.next();

        System.out.println("Enter the name of piece of clothing : ");
        String Cloth = sc.next();

        System.out.println("Enter the name of a hobby");
        String hobby = sc.next();

        System.out.println("Enter another adjective : ");
        String adjective3 = sc.next();

        System.out.println("Enter another occupation : ");
        String occupation2 = sc.next();

        System.out.println("Enter a boy's name :  ");
        String boyName = sc.next();

        System.out.println("Enter a man's name");
        String manName = sc.next();


        System.out.println("There once was a "+ adjective+" girl named "+girlName+" who was a "+adjective2+" "
                + occupation+" in the kingdom of "+place+". She loved to wear "+Cloth+" and to "+hobby+"."
                + " She wanted to marry the "+adjective3+" "+occupation2+" named "+boyName+", but her father,"
                + " king "+manName+", forbid her from seeing him. ");
    }

}
