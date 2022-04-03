package project.proj07_2_Ice_cream;

import java.util.ArrayList;

public class IceCream {
    private String name ;
    private int cost;
    private int noOfScoops;
    private ArrayList<String>toppings;
    public IceCream(String name, int cost,int noOfScoops){
        this.name=name;
        this.cost=cost;
        this.noOfScoops=noOfScoops;
        this.toppings=new ArrayList<>();
    }
    public void addToppings(String topping){
        toppings.add(topping);
    }
    public String getName() {
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getNoOfScoops(){
        return noOfScoops;
    }
    public void printToppinggs(){
        for(String topping : toppings){
            System.out.println("\t"+topping);
        }
    }
}