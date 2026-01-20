package TrafficManager;

public class Roundabout {

    private Vehicle head = null;

    // Add car to roundabout
    public void addCar(String number) {
        Vehicle newCar = new Vehicle(number);

        // Case 1: Empty roundabout
        if (head == null) {
            head = newCar;
            head.next = head;
            return;
        }

        // Case 2: Non-empty
        Vehicle temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newCar;
        newCar.next = head;
    }

    // Remove car from roundabout
    public void removeCar(String number) {

        if (head == null) {
            System.out.println("Roundabout Empty");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.number.equals(number)) {

                // Case 1: Only one car
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Case 2: Removing head
                else if (curr == head) {
                    Vehicle temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                // Case 3: Removing middle/last car
                else {
                    prev.next = curr.next;
                }

                System.out.println("Car removed: " + number);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Car not found");
    }

    // Display roundabout
    public void display() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
