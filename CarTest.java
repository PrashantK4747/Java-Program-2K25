/*Develop a Java application to manage car details and perform price discount calculations. 
The program should define a Car class that holds information such as the make, model, and price 
of a car. The constructor of the class should initialize these attributes, and if an invalid 
(negative) price is provided, it should default to zero. Additionally, the class should contain a 
method to display the car's details. In the main program, create at least two Car objects with 
predefined values. The program should display the information of both cars, prompt the user to enter 
a discount percentage, and then calculate and display the price of each car after applying the discount. 
The solution must use object-oriented programming principles and proper user input handling. */


// Importing Scanner class for taking input from user
import java.util.Scanner;

// Defining the Car class
class Car {
    // Instance variables to hold car details
    String make, model;
    double price;

    // Constructor to initialize the car object
    Car(String make, String model, double price) {
        this.make = make;       // Assign car's make (e.g., TATA)
        this.model = model;     // Assign car's model (e.g., XUV500)

        // Check if the price is valid (non-negative)
        if (price >= 0) {
            this.price = price; // Assign the price if valid
        } else {
            this.price = 0.0;   // Default to 0.0 if price is negative
        }
    }

    // Method to display car details
    void getInfo() {
        System.out.println("Make: " + make);     // Display car's make
        System.out.println("Model: " + model);   // Display car's model
        System.out.println("Price: " + price);   // Display car's price
    }
}

// Main class to test the Car class functionality
class CarTest {
    public static void main(String[] args) {
        // Creating Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Creating two Car objects with specific data
        Car c1 = new Car("TATA", "XUV500", 2000000); // First car object
        Car c2 = new Car("TATA", "PUNCH", 1000000);  // Second car object

        // Displaying details of the first car
        System.out.println("CAR 1:");
        c1.getInfo();

        System.out.println(); // Blank line for readability

        // Displaying details of the second car
        System.out.println("CAR 2:");
        c2.getInfo();

        System.out.println(); // Blank line for readability

        // Prompting user to enter discount percentage
        System.out.print("Enter Discount: ");
        float dic = s.nextFloat(); // Reading discount as float

        System.out.println(); // Blank line for readability

        // Calculating and displaying price after discount for the first car
        System.out.println("After Discount Price of " + c1.model + " : " +
            (c1.price - ((c1.price * dic) / 100)));

        // Calculating and displaying price after discount for the second car
        System.out.println("After Discount Price of " + c2.model + " : " +
            (c2.price - ((c2.price * dic) / 100)));
    }
}
