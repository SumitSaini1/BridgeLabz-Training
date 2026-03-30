// Circle Radius details class
class CircleRadius{
     // instance variables
    private double radius;

    // parameterized constructor
    CircleRadius(double radius){
        this.radius=radius;
    }
    // Non parameterized constructor
    CircleRadius(){
        radius=3.6;

    }
     // display result 
    void display(){
        System.out.println("Radius of circle is: "+ radius);
        System.out.println("--------------------------------");
    }
}
// public class 
public class Circle {
    public static void main(String[] args) {
          // create object 1.
        CircleRadius radius1=new CircleRadius();
        // call method using object 
        radius1.display();
        // create object 2.
        CircleRadius radius2=new CircleRadius(23.5);
        radius2.display();
        
    }
   

    
}
