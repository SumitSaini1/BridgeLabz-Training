public class AnimalTest {

    // parent class
    static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // child class
    static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // main method
    public static void main(String[] args) {

        Animal animal = new Dog(); // polymorphism
        animal.makeSound();
    }
}
