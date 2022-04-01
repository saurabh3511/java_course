package project;

import java.util.ArrayList;

public class proj06_1_Sum_of_Element {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(38);
        System.out.println(sumOfElement(list));
    }
    public static int sumOfElement(ArrayList<Integer> list){
        int sum = 0;
        for(int i=0;i< list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
