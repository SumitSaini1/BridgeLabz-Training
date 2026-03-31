package PersonalizedMealPlanGenerator;

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VeganMeal> vegan = new Meal(new VeganMeal());
        vegan.display();

        Meal<VegetarianMeal> vegetarian = new Meal(new VegetarianMeal());
        vegetarian.display();

    }

}
