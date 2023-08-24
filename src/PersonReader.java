import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {
    public static List<String> readPersonDataFromFile(String fileName) {
        List<String> personData = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                personData.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading data from file: " + e.getMessage());
        }

        return personData;
    }
}