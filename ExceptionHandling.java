/*Develop application which can handle any 5 combination of predefined compile time and runtime 
exceptions using multiple catch blocks. Use throws and finally keywords as well.  */


// Importing necessary classes from java.io package
import java.io.*;

public class ExceptionHandling {

    // Method that reads from a file and throws IOException (checked exception)
    static void readFile() throws IOException {
        // Attempting to open and read from a file named "sample.txt"
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        System.out.println("Reading file: " + reader.readLine());
        reader.close(); // Closing the file after reading
    }

    public static void main(String[] args) {
        // Try block where multiple types of exceptions might occur
        try {
            // 1. ArithmeticException: divide by zero
            int a = 10, b = 0;
            int c = a / b; // This line will throw ArithmeticException

            // 2. ArrayIndexOutOfBoundsException: accessing invalid index of array
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Index 5 doesn't exist in array of size 3

            // 3. NumberFormatException: parsing a non-numeric string to integer
            int num = Integer.parseInt("abc"); // "abc" is not a number

            // 4. NullPointerException: calling method on a null reference
            String str = null;
            System.out.println(str.length()); // str is null, this will throw NullPointerException

            // 5. IOException: trying to read from a file that may not exist
            readFile(); // Method throws IOException if file is not found or unreadable

        } catch (ArithmeticException e) {
            // Catches and handles divide-by-zero error
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catches array index out-of-bounds errors
            System.out.println("Array Index Out Of Bounds: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Catches number format issues when parsing strings
            System.out.println("Number Format Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            // Catches attempts to access members of a null object
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (IOException e) {
            // Catches input/output errors, such as file not found
            System.out.println("IO Exception: " + e.getMessage());
        } finally {
            // This block always executes regardless of exception occurrence
            System.out.println("Finally block: Always executes.");
        }

        // This line runs after all exception handling
        System.out.println("Program ends gracefully.");
    }
}
