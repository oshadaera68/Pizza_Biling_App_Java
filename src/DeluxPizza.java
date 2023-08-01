/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
