public class InventoryManagementSystem {

    // head points to first node
    public static Node head;
    // tail points to last node
    public static Node tail;

    public static int size;

    // node class to store item data
    public static class Node {

        int itemId;
        String itemName;
        int quantity;
        double price;

        Node next;

        // constructor to create new node
        Node(int itemId, String itemName, int quantity, double price) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    // add item at beginning
    public void addFirst(int itemId, String itemName, int quantity, double price) {
        Node newNode = new Node(itemId, itemName, quantity, price);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add item at end
    public void addLast(int itemId, String itemName, int quantity, double price) {
        Node newNode = new Node(itemId, itemName, quantity, price);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add item at specific position
    public void addAtPosition(int itemId, String itemName, int quantity, double price, int index) {
        if (index == 0) {
            addFirst(itemId, itemName, quantity, price);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(itemId, itemName, quantity, price);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove item by item id
    public void removeByItemId(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            System.out.println("Item removed");
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.itemId == itemId) {
                prev.next = curr.next;
                size--;
                System.out.println("Item removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Item not found");
    }

    // update quantity by item id
    public void updateQuantity(int itemId, int quantity) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = quantity;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // search item by item id
    public void searchByItemId(int itemId) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                displaySingleItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // search item by item name
    public void searchByItemName(String itemName) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                displaySingleItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // calculate total inventory value
    public void calculateTotalValue() {
        Node temp = head;
        double totalValue = 0;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    // sort inventory by item name
    public void sortByItemName(boolean ascending) {
        if (head == null) return;

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
                    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {

                    swapData(i, j);
                }
            }
        }
    }

    // sort inventory by price
    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if ((ascending && i.price > j.price) ||
                    (!ascending && i.price < j.price)) {

                    swapData(i, j);
                }
            }
        }
    }

    // swap node data
    private void swapData(Node a, Node b) {
        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQty;
        b.price = tempPrice;
    }

    // display single item
    private void displaySingleItem(Node temp) {
        System.out.println("------------Item Details----------------");
        System.out.println("Item ID: " + temp.itemId);
        System.out.println("Item Name: " + temp.itemName);
        System.out.println("Quantity: " + temp.quantity);
        System.out.println("Price: " + temp.price);
    }

    // display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        Node temp = head;
        int i = 1;
        System.out.println("================ INVENTORY LIST ================");
        while (temp != null) {
            System.out.println("------------Item " + i + "----------------");
            System.out.println("Item ID: " + temp.itemId);
            System.out.println("Item Name: " + temp.itemName);
            System.out.println("Quantity: " + temp.quantity);
            System.out.println("Price: " + temp.price);
            temp = temp.next;
            i++;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();

        inventory.addFirst(101, "Laptop", 5, 55000);
        inventory.addLast(102, "Mouse", 20, 500);
        inventory.addLast(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(104, "Monitor", 7, 12000, 2);

        inventory.displayInventory();

        inventory.updateQuantity(102, 30);

        inventory.searchByItemId(101);
        inventory.searchByItemName("Keyboard");

        inventory.calculateTotalValue();

        inventory.sortByItemName(true);
        inventory.displayInventory();

        inventory.sortByPrice(false);
        inventory.displayInventory();

        inventory.removeByItemId(103);
        inventory.displayInventory();

        System.out.println("Size: " + inventory.size);
    }
}
