import java.util.*;

public class Person {
    // instance variables
    static String name;
    static String city;

     // parameterized constructor
    Person(String name,String city){
        this.name=name;
        this.city=city;
    }
    // copy constructor
    Person(Person s1){
        name=s1.name;
        city=s1.city;

    }
      // display result 
    void display(){
        System.out.println("Name:"+ name + "\nCity:"+ city);
        System.out.println("--------------------------------");


    }


    public static void main(String[] args) {

        Person s1=new Person("Rahul","City");
        Person s2=new Person(s1);
        s1.display();
        s2.display();


        
    }

    
}
