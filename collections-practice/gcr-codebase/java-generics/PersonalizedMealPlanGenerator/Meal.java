package PersonalizedMealPlanGenerator;

public class Meal <T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan){
        this.mealPlan=mealPlan;
    }
    
    void display(){
        System.out.println("=======Meal details===========");
        System.out.println("Meal plan:"+mealPlan.getMealDescription());
        System.out.println("----------------------------------------");
    }

}
