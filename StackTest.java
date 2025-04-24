/*Create the interface stack which has variable size, abstract methods push(),pop(),display(), 
overflow() and underflow(). We need to implement 3 subclasses IntegerStack, StringStack and DoubleStack 
respectively by implementing  interface. All the methods in interface are declared for string. And in subclass for 
integerStack convert string to integer. Same thing to all other. Create one test class and check for the working of all the 
classes. */


// Importing the Scanner class for user input
import java.util.Scanner;

// Defining an interface named Stack
interface Stack {
    // A constant variable defining the maximum size of the stack
    int size = 10;

    // Abstract methods to be implemented by subclasses
    void push(String a);        // Method to push an element (given as String)
    String pop();               // Method to pop the top element (returns String)
    void display();             // Method to display stack elements
    boolean overflow();         // Checks if the stack is full
    boolean underflow();        // Checks if the stack is empty
}

// Class to implement a stack of integers
class IntegerStack implements Stack {
    int top, arr[];

    // Constructor initializes the array and top
    IntegerStack() {
        arr = new int[size];
        top = -1;
    }

    // Push method to insert an integer converted from string
    public void push(String a) {
        top++;
        arr[top] = Integer.parseInt(a);  // Convert string to int
    }

    // Pop method returns the top element as a string
    public String pop() {
        top--;
        return String.valueOf(arr[top + 1]);  // Convert int to string
    }

    // Display method prints all elements from top to bottom
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top - 1; i > -1; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Checks for overflow condition
    public boolean overflow() {
        return top == size - 1;
    }

    // Checks for underflow condition
    public boolean underflow() {
        return top == -1;
    }
}

// Class to implement a stack of strings
class StringStack implements Stack {
    int top;
    String arr[];

    // Constructor initializes the array and top
    StringStack() {
        arr = new String[size];
        top = -1;
    }

    // Push method to insert string directly
    public void push(String a) {
        top++;
        arr[top] = a;
    }

    // Pop method returns the top string
    public String pop() {
        top--;
        return arr[top + 1];
    }

    // Display method prints all strings from top to bottom
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top - 1; i > -1; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Checks for overflow
    public boolean overflow() {
        return top == size - 1;
    }

    // Checks for underflow
    public boolean underflow() {
        return top == -1;
    }
}

// Class to implement a stack of doubles
class DoubleStack implements Stack {
    int top;
    double arr[];

    // Constructor initializes the array and top
    DoubleStack() {
        arr = new double[size];
        top = -1;
    }

    // Push method to convert string to double and insert
    public void push(String a) {
        top++;
        arr[top] = Double.parseDouble(a);
    }

    // Pop method returns the top double as a string
    public String pop() {
        top--;
        return String.valueOf(arr[top + 1]);
    }

    // Display method prints all doubles from top to bottom
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top - 1; i > -1; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Checks for overflow
    public boolean overflow() {
        return top == size - 1;
    }

    // Checks for underflow
    public boolean underflow() {
        return top == -1;
    }
}

// Test class to demonstrate the working of stack implementations
class StackTest {
    public static void main(String args[]) {
        IntegerStack i = new IntegerStack();  // Creating object for IntegerStack
        Scanner sc = new Scanner(System.in);  // Scanner object for input

        String m;  // Variable to hold user input

        // Menu loop
        while (true) {
            System.out.println("Select from option:\n1)Push\n2)Pop\n3)Display\n4)Overflow\n5)Underflow\n6)Exit\nEnter option:");
            int n = sc.nextInt();  // Reading option
            sc.nextLine();  // Clear buffer

            switch (n) {
                case 1:
                    System.out.println("Enter the element to add in stack:");
                    m = sc.nextLine();
                    i.push(m);  // Pushing element
                    break;
                case 2:
                    System.out.println("Deleted element: " + i.pop());  // Popping element
                    break;
                case 3:
                    i.display();  // Display stack
                    break;
                case 4:
                    System.out.println("Stack Overflow: " + i.overflow());  // Check overflow
                    break;
                case 5:
                    System.out.println("Stack Underflow: " + i.underflow());  // Check underflow
                    break;
                case 6:
                    return;  // Exit
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
