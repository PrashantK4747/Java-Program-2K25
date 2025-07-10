import java.io.*;

public class ExceptionHandling_6 {

    // Method demonstrating compile-time exception (IOException)
    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
        System.out.println(reader.readLine());
        reader.close();
    }

    // Method demonstrating runtime exception (ArithmeticException)
    public static void divideByZero() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    // Method demonstrating runtime exception (NullPointerException)
    public static void nullPointerExample() {
        String str = null;
        System.out.println(str.length());
    }

    // Method demonstrating runtime exception (ArrayIndexOutOfBoundsException)
    public static void arrayOutOfBounds() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);
    }

    // Method demonstrating runtime exception (NumberFormatException)
    public static void numberFormat() {
        int num = Integer.parseInt("ABC");
        System.out.println("Parsed number: " + num);
    }

    public static void main(String[] args) {
        try {
            readFile();                // Compile-time exception
            divideByZero();            // Runtime
            nullPointerExample();      // Runtime
            arrayOutOfBounds();        // Runtime
            numberFormat();            // Runtime
        } 
        catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed. This is the finally block.");
        }
    }
}
