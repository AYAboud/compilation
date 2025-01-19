//package parseurjava;
import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class ConverterApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option:");
            System.out.println("1. Convert JSON to XML");
            System.out.println("2. Convert XML to JSON");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            System.out.println("Enter the input file path:");
            String inputFilePath = scanner.nextLine();
            File inputFile = new File(inputFilePath);

            System.out.println("Enter the output file path:");
            String outputFilePath = scanner.nextLine();
            File outputFile = new File(outputFilePath);

            if (choice == 1) {
                // JSON to XML
                JsonParser jsonParser = new JsonParser(new FileInputStream(inputFile));
                Map<String, Object> json = jsonParser.OBJECT(); // Parse JSON
                String xml = JsonParser.jsonToXml(json); // Convert to XML
                writeToFile(outputFile, xml);
                System.out.println("JSON converted to XML successfully!");
            } else if (choice == 2) {
                // XML to JSON
                XmlParser xmlParser = new XmlParser(new FileInputStream(inputFile));
                Node rootNode = xmlParser.document(); // Parse XML to Node
                Map<String, Object> json = XmlParser.xmlToJson(rootNode); // Convert Node to JSON
                String jsonOutput = new Gson().toJson(json); // Format JSON
                writeToFile(outputFile, jsonOutput);
                System.out.println("XML converted to JSON successfully!");
            } else {
                System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void writeToFile(File file, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }
}
