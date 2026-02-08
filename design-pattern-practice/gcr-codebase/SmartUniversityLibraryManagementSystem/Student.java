package LibraryManagementSystem;

class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    public void update(String msg) {
        System.out.println(name + " notified: " + msg);
    }
}

class Faculty implements User {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Faculty.");
    }

    public void update(String msg) {
        System.out.println(name + " notified: " + msg);
    }
}

class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Librarian.");
    }

    public void update(String msg) {
        System.out.println(name + " notified: " + msg);
    }
}
