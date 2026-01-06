import java.util.Scanner;

public class CafeteriaMenuApp {
    // display all menu
    public static void displayMenu(String[] menu) {
        System.out.println("---------------------CAFE MENU-----------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Item " + (i + 1) + ":" + menu[i]);

        }

    }

    // get item by index
    public static void getItemByIndex(String[] menu, int indexToFind) {
        int index = indexToFind - 1; // Convert to array index
    
        if (index >= 0 && index < menu.length) {
            System.out.println("You selected: " + menu[index]);
        } else {
            System.out.println("Invalid index! Please select between 1 and " + menu.length);
        }
    }
    

    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // create array to store menu
        String[] menu = {
            "Tea",
            "Coffee",
            "Veg Sandwich",
            "Burger",
            "Pizza",
            "Pasta",
            "French Fries",
            "Cold Drink",
            "Ice Cream",
            "Cake"
        };
        
        
        // call method to display menu
        displayMenu(menu);
        // enter a index number find by index ;
        System.out.println("Enter a index to find :");
        int indexToFind = input.nextInt();
        // call method to find item by index
        getItemByIndex(menu, indexToFind);

        input.close();

    }

}
