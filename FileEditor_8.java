import java.io.*;
import java.util.Scanner;

public class FileEditor_8 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide filename as a command-line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists. Contents of the file:");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();

                System.out.println("\nChoose an option:\n1. Append data\n2. Replace text");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter text to append (type 'exit' to finish):");
                        FileWriter writer = new FileWriter(file, true);
                        while (true) {
                            String input = scanner.nextLine();
                            if (input.equalsIgnoreCase("exit")) break;
                            writer.write(input + "\n");
                        }
                        writer.close();
                        break;

                    case 2:
                        System.out.print("Enter text to replace: ");
                        String oldText = scanner.nextLine();
                        System.out.print("Enter new text: ");
                        String newText = scanner.nextLine();

                        BufferedReader br = new BufferedReader(new FileReader(file));
                        StringBuilder content = new StringBuilder();
                        String ln;
                        while ((ln = br.readLine()) != null) {
                            content.append(ln.replace(oldText, newText)).append("\n");
                        }
                        br.close();

                        FileWriter fw = new FileWriter(file);
                        fw.write(content.toString());
                        fw.close();
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } else {
                System.out.println("File does not exist. Creating new file...");
                FileWriter writer = new FileWriter(file);
                System.out.println("Enter text (type 'exit' to finish):");
                while (true) {
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                    writer.write(input + "\n");
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
