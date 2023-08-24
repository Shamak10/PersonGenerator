import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "PersonTestData.txt";
        List<String> personData = PersonReader.readPersonDataFromFile(fileName);

        for (String data : personData) {
            System.out.println(data);
        }
    }
}