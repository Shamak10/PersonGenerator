import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> personsData = new ArrayList<>();

        while (true) {
            System.out.print("Enter person's ID or 'q' to quit: ");
            String id = scanner.nextLine();

            if (id.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter person's First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter person's Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter person's Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter person's Birth Day (dd): ");
            String day = scanner.nextLine();

            System.out.print("Enter person's Birth Month (mm): ");
            String month = scanner.nextLine();

            System.out.print("Enter person's Birth Year (yyyy): ");
            String year = scanner.nextLine();

            String personData = id + ", " + firstName + ", " + lastName + ", " + title + ", " + day + "-" + month + "-" + year;
            personsData.add(personData);
        }

        System.out.print("Enter a name for the output file: ");
        String fileName = scanner.nextLine();

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (String personData : personsData) {
                writer.println(personData);
            }
            writer.close();
            System.out.println("Data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving data to file: ");
        }
    }
}