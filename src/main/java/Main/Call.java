package Main;

public class Call extends Shape {
    public static void main(String[] args) {

            Circle circle = new Circle();
            circle.radius = 5.5;
            circle.calculateArea();
            circle.calculatePerimeter();
        System.out.println();
            Square square = new Square();
            square.side = 4.0;
            square.calculateArea();
            square.calculatePerimeter();
        System.out.println();
            Rectangle rectangle = new Rectangle();
            rectangle.length = 6;
            rectangle.width = 7;
            rectangle.calculateArea();
            rectangle.calculatePerimeter();


        }
    }

