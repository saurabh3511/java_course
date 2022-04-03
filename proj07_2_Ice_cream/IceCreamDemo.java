package project.proj07_2_Ice_cream;

public class IceCreamDemo {

    public static void main(String[] args) {
        IceCream myIceCream = new IceCream("Chocolate", 3, 2);
        IceCream yourIceCream = new IceCream("ButterScotch", 4, 5);
        myIceCream.addToppings("Cherry");
        myIceCream.addToppings("nuts");
        yourIceCream.addToppings("sprinkles");
        printing(myIceCream);

    }

    public static void printing(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost is : rs " + iceCream.getCost());
    }
}