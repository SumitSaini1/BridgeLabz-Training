class Person {
    // instance
    protected String name;
    protected int id;
    // constructor 
    Person(String name, int id) {
        this.name = name;
        this.id = id;

    }

}
// interface 
interface worker {
    public void performDuties();

}
// implement interface 
class Chef extends Person implements worker {
    Chef(String name, int id) {
        // call super constructor 
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef is cooking food");

    };

}
// implement interface 
class Waiter extends Person implements worker {
    Waiter(String name, int id) {
        // call super constructor 
        super(name, id);
    }

    public void performDuties() {
        System.out.println("waiter is serving food");

    };



}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        
        // create object 
        Chef chef = new Chef("Raj", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.performDuties();
        waiter.performDuties();

    }

}
