package project;
import java.util.*;
public class proj03_2_Divisible_by_Three {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int number =sc.nextInt();

        //checking divisiblity
        if(number%3==0)
            System.out.print(number+" is divisible by 3");
        else
            System.out.println(number +" is not divisible by 3 ");
    }
}
