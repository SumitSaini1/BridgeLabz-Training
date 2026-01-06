import java.util.Scanner;

public class InvoiceGeneratorFreelancers {
    // splits the invoice string into individual tasks
    public static String[] parseInvoice(String input){
        String[] tasks=input.split(",");
        return tasks;

        
    }
    // method calculates the total amount 
    public static int getTotalAmount(String[] tasks){
        // store total cost 
        int totalCost=0;
        for(int i=0;i<tasks.length;i++){
            // remove extra spaces from the task string
            String value=tasks[i].trim();
            //  Split task name and price using "-"
            String[] parseValue=value.split("-");
            // parse amount 
            String[] parsenumber=parseValue[1].trim().split(" ");
            // Convert the string number into integer
            int cost=Integer.parseInt(parsenumber[0]);
            System.out.println(parseValue[0].trim() + " : " + cost + " INR");
            // add cost to totalAmount 
            totalCost+=cost;

        }
        return totalCost;


    }
    public static void main(String[] args) {
        String input="Logo Design - 3000 INR, Web Page - 4500 INR";

        String[] task=parseInvoice(input);
        int totalAmount=getTotalAmount(task);
        System.out.println("Total amount: "+totalAmount);
    }
    
}
