import java.io.*;
import java.util.Scanner;


class Student9 implements Serializable {
    String name;
    int age;
    double weight;
    double height;
    String city;
    String phone;

    public Student9(String name, int age, double weight, double height, String city, String phone) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.city = city;
        this.phone = phone;
    }
}


public class StudentData_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "studentData.txt";

        try {
            // Get student info
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter weight: ");
            double weight = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            sc.nextLine(); // Consume newline
            System.out.print("Enter city: ");
            String city = sc.nextLine();
            System.out.print("Enter phone: ");
            String phone = sc.nextLine();

            // Write to file using DataOutputStream
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(weight);
            dos.writeDouble(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

            dos.close();

            // Read from file using DataInputStream
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);

            Student9 s = new Student9(
                    dis.readUTF(),
                    dis.readInt(),
                    dis.readDouble(),
                    dis.readDouble(),
                    dis.readUTF(),
                    dis.readUTF()
            );
            dis.close();

            // Display student data
            System.out.println("\n--- Student Information Retrieved ---");
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Weight: " + s.weight);
            System.out.println("Height: " + s.height);
            System.out.println("City: " + s.city);
            System.out.println("Phone: " + s.phone);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
//javac Student.java StudentDataIO.java
//java StudentDataIO

