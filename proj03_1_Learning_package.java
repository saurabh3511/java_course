package project;
import java.util.*;
public class proj03_1_Learning_package {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int baseCost;
        int costPerCourse;
        int numIncluded ;
        int totalCost;
        System.out.println("which of the package do you want? 1,2 or3?");
        int packageNumber = sc.nextInt();
        System.out.println("How many courses did you enroll in this month");
        int howManyCourses =sc.nextInt();

        if(packageNumber == 1) {
            baseCost =10;
            costPerCourse =6;
            numIncluded =2;
        }else if(packageNumber == 2) {
            baseCost =12;
            costPerCourse =4;
            numIncluded =4;

        }else {
            baseCost =15;
            costPerCourse =3;
            numIncluded =6;

        }
        //total cost
        if(howManyCourses>numIncluded) {
            totalCost =baseCost +(howManyCourses -numIncluded)*costPerCourse;
        }else {
            totalCost =baseCost;
        }

        System.out.print("Total cost is : "+totalCost);
    }
}
