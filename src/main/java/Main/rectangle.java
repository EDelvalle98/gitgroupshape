package Main;

public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
    public static void main(String[] args) {

    }


