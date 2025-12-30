class Circle {

    // instance variable
    double radius;

    // method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // method to display results
    void display() {
        System.out.println("Area of circle: " + calculateArea());
        System.out.println("Circumference of circle: " + calculateCircumference());

    }

    public static void main(String[] args) {

        // create object
        Circle circle = new Circle();

        // assign radius
        circle.radius = 2.5;

        // display area and circumference
        circle.display();
    }
}
