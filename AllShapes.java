/*Create abstract class Shape which has instance variables side, area and perimeter And methods 
calculateArea(),  calculatePerimeter() as abstract methods and display() as concrete method. Write subclasses which 
extend Shape class like Triangle, Rectangle, Circle , Cube and Squere and override abstract methods and display 
methods in subclass take instance variable if needed as per the formula. And use parameterized constructor to initialize 
instance variables using “this” reference variable 
Write Test class and Create a reference variable of Shape which will hold the objects of all the sub classes and calculate 
respective area, perimeter and display the results. */


// Base class Shape
class Shape {
    float side;  // Common property used for side, length, radius, etc.

    // Constructor to initialize side
    Shape(float side) {
        this.side = side;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    float width;

    // Constructor to initialize length and width
    Rectangle(float side, float width) {
        super(side);  // Calling Shape constructor
        this.width = width;
        System.out.println("-----Rectangle-----");
        System.out.println("<<Length:" + super.side + " Breadth:" + width + ">>");
    }

    // Method to calculate and display area
    void areaOfRectangle() {
        System.out.println("Area Of Rectangle:" + (super.side * width));
    }

    // Method to calculate and display perimeter
    void perimeterOfRectangle() {
        System.out.println("Perimeter Of Rectangle:" + (2 * super.side + 2 * width));
        System.out.println();
    }
}

// Square class extending Shape
class Square extends Shape {

    // Constructor to initialize side
    Square(float side) {
        super(side);  // Calling Shape constructor
        System.out.println("-----Square--------");
        System.out.println("<<Side:" + super.side + ">>");
    }

    // Method to calculate and display area
    void areaOfSquare() {
        System.out.println("Area Of Square:" + (super.side * super.side));
    }

    // Method to calculate and display perimeter
    void perimeterOfSquare() {
        System.out.println("Perimeter Of Square:" + (4 * super.side));
        System.out.println();
    }
}

// Circle class extending Shape
class Circle extends Shape {

    // Constructor to initialize radius
    Circle(float radius) {
        super(radius);  // Using 'side' as radius
        System.out.println("-----Circle--------");
        System.out.println("<<Radius:" + super.side + ">>");
    }

    // Method to calculate and display area
    void areaOfcircle() {
        System.out.println("Area Of Circle:" + (Math.PI * super.side * super.side));
    }

    // Method to calculate and display perimeter
    void perimeterOfCircle() {
        System.out.println("Perimeter Of Circle:" + (2 * Math.PI * super.side));
        System.out.println();
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    float height, s2, s3;  // s2 and s3 are the other two sides

    // Constructor to initialize all sides and height
    Triangle(float side, float s2, float s3, float height) {
        super(side);  // Using 'side' as base
        this.height = height;
        this.s2 = s2;
        this.s3 = s3;
        System.out.println("-----Triangle------");
        System.out.println("<<Base Side:" + super.side + " Side 2:" + s2 + " Side 3:" + s3 + " Height:" + height + ">>");
    }

    // Method to calculate and display area
    void areaOfTriangle() {
        System.out.println("Area Of Triangle:" + (0.5f * super.side * height));
    }

    // Method to calculate and display perimeter
    void perimeterOfTriangle() {
        System.out.println("Perimeter Of Triangle:" + (super.side + s2 + s3));
        System.out.println();
    }
}

// Cube class extending Shape
class Cube extends Shape {

    // Constructor to initialize side
    Cube(float side) {
        super(side);  // Calling Shape constructor
        System.out.println("-----Cube----------");
        System.out.println("<<Side:" + super.side + ">>");
    }

    // Method to calculate and display volume
    void volumeOfCube() {
        System.out.println("Volume Of Cube:" + super.side * super.side * super.side);
    }

    // Method to calculate and display surface area
    void surfaceAreaOfCube() {
        System.out.println("Surface Area Of Cube:" + (6 * super.side * super.side));
        System.out.println();
    }
}

// Main class to test all shapes
class AllShapes {
    public static void main(String[] args) {

        // Rectangle with length 10 and width 5
        Rectangle r = new Rectangle(10, 5);
        r.areaOfRectangle();
        r.perimeterOfRectangle();

        // Square with side 10
        Square s = new Square(10);
        s.areaOfSquare();
        s.perimeterOfSquare();

        // Circle with radius 7
        Circle c = new Circle(7);
        c.areaOfcircle();
        c.perimeterOfCircle();

        // Triangle with sides 2, 3, 4 and height 5
        Triangle t = new Triangle(2, 3, 4, 5);
        t.areaOfTriangle();
        t.perimeterOfTriangle();

        // Cube with side 5
        Cube cu = new Cube(5);
        cu.volumeOfCube();
        cu.surfaceAreaOfCube();
    }
}
