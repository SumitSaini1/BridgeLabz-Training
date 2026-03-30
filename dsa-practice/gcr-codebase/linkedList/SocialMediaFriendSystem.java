class Node {

    int userId;
    String name;
    int age;

    int[] friends;      // list of friend IDs
    int friendCount;

    Node next;

    Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new int[10]; // max 10 friends
        this.friendCount = 0;
        this.next = null;
    }
}

public class SocialMediaFriendSystem {

    public static Node head;
    public static int size;

    // add new user
    public void addUser(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // find user by ID
    public Node findUserById(int userId) {
        Node temp = head;

        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // add friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {

        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        user1.friends[user1.friendCount++] = userId2;
        user2.friends[user2.friendCount++] = userId1;

        System.out.println("Friend connection added");
    }

    // remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {

        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriend(user1, userId2);
        removeFriend(user2, userId1);

        System.out.println("Friend connection removed");
    }

    private void removeFriend(Node user, int friendId) {
        for (int i = 0; i < user.friendCount; i++) {
            if (user.friends[i] == friendId) {
                for (int j = i; j < user.friendCount - 1; j++) {
                    user.friends[j] = user.friends[j + 1];
                }
                user.friendCount--;
                return;
            }
        }
    }

    // find mutual friends
    public void findMutualFriends(int userId1, int userId2) {

        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends:");
        for (int i = 0; i < user1.friendCount; i++) {
            for (int j = 0; j < user2.friendCount; j++) {
                if (user1.friends[i] == user2.friends[j]) {
                    System.out.println("Friend ID: " + user1.friends[i]);
                }
            }
        }
    }

    // display all friends of a user
    public void displayFriends(int userId) {

        Node user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int i = 0; i < user.friendCount; i++) {
            System.out.println("Friend ID: " + user.friends[i]);
        }
    }

    // search user by name
    public void searchByName(String name) {
        Node temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("User ID: " + temp.userId);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // search user by ID
    public void searchById(int userId) {
        Node user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("User ID: " + user.userId);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
    }

    // count friends for each user
    public void countFriends() {
        Node temp = head;

        while (temp != null) {
            System.out.println("User: " + temp.name + " | Friends Count: " + temp.friendCount);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SocialMediaFriendSystem system = new SocialMediaFriendSystem();

        system.addUser(1, "Sumit", 22);
        system.addUser(2, "Aditya", 23);
        system.addUser(3, "Rahul", 24);

        system.addFriendConnection(1, 2);
        system.addFriendConnection(1, 3);
        system.addFriendConnection(2, 3);

        system.displayFriends(1);

        system.findMutualFriends(1, 2);

        system.searchByName("Rahul");
        system.searchById(2);

        system.countFriends();

        system.removeFriendConnection(1, 2);

        system.displayFriends(1);
    }
}
