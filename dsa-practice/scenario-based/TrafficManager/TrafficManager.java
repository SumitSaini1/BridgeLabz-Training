package TrafficManager;

import java.util.Scanner;

public class TrafficManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Roundabout roundabout = new Roundabout();

        System.out.print("Enter waiting queue capacity: ");
        int capacity = sc.nextInt();
        WaitingQueue queue = new WaitingQueue(capacity);

        int choice;

        do {
            System.out.println("\n===== Traffic Manager Menu =====");
            System.out.println("1. Add car to waiting queue");
            System.out.println("2. Move car from queue to roundabout");
            System.out.println("3. Remove car from roundabout");
            System.out.println("4. Display roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter car number: ");
                    String car = sc.next();
                    queue.enqueue(car);
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        String movedCar = queue.dequeue();
                        roundabout.addCar(movedCar);
                        System.out.println("Car entered roundabout: " + movedCar);
                    } else {
                        System.out.println("Waiting queue is empty");
                    }
                    break;

                case 3:
                    System.out.print("Enter car number to remove: ");
                    String removeCar = sc.next();
                    roundabout.removeCar(removeCar);
                    break;

                case 4:
                    roundabout.display();
                    break;

                case 5:
                    System.out.println("Traffic system stopped");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
