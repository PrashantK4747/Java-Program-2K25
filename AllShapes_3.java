abstract class Shape {
    protected double side;
    protected double area;
    protected double perimeter;

    public Shape(double side) {
        this.side = side;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    public void display() {
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
    }
}
class Triangle extends Shape {

    public Triangle(double side) {
        super(side);
    }

    @Override
    public void calculateArea() {
        area = (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 3 * side;
    }

    @Override
    public void display() {
        System.out.println("Triangle:");
        super.display();
    }
}
class Rectangle extends Shape {
    private double length;

    public Rectangle(double length, double breadth) {
        super(breadth); // side = breadth
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area = length * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + side);
    }

    @Override
    public void display() {
        System.out.println("Rectangle:");
        super.display();
    }
}
class Circle extends Shape {

    public Circle(double radius) {
        super(radius); // side = radius
    }

    @Override
    public void calculateArea() {
        area = Math.PI * side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * side;
    }

    @Override
    public void display() {
        System.out.println("Circle:");
        super.display();
    }
}
class Cube extends Shape {

    public Cube(double side) {
        super(side);
    }

    @Override
    public void calculateArea() {
        area = 6 * side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 12 * side;
    }

    @Override
    public void display() {
        System.out.println("Cube:");
        super.display();
    }
}
class Square extends Shape {

    public Square(double side) {
        super(side);
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
    }

    @Override
    public void display() {
        System.out.println("Square:");
        super.display();
    }
}
public class AllShapes_3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(7);
        shapes[3] = new Cube(3);
        shapes[4] = new Square(4);

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            shape.display();
            System.out.println("-----------------------");
        }
    }
}
