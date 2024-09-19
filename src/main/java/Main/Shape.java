package Main;

public class Shape {

    public String color;
    public double area;
    public double perimeter;
    public double radius;
    public double side;
    public double length;
    public double width;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.5;
        circle.calculateArea();
        circle.calculatePerimeter();

    }

    public void calculateArea() {
        System.out.println("This method calculates Area");
    }

    public void calculatePerimeter() {
        System.out.println("This method calculates Perimeter");

    }
}
