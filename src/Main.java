public class Main {

    public static void main(String[] args) {

        Meal meal = new Meal();
        meal.addBurgerToppings("BACON", "CHEESE", "AVOCADO");
        meal.setDrinkSize("LARGE");
        meal.printItemizedList();

    }
}
