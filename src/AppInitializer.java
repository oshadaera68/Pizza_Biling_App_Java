
/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
       /* Pizza pizza = new Pizza(true);
        pizza.addExtraToppings();
        pizza.addExtraCheese();
        pizza.takeAway();
        pizza.getBill();*/

        DeluxPizza pizza = new DeluxPizza(false);
        pizza.takeAway();
        pizza.getBill();
    }
}
