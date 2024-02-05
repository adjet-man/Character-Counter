import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        try {
            try (// Prompt the user to enter the file path
            Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter the path to the text file: ");
                String filePath = scanner.nextLine();

                // Create a File object using the provided file path
                File file = new File(filePath);

                if (!file.exists()) {
                    System.err.println("File does not exist.");
                    return;
                }

                // Open and read the file
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                int characterCount = 0;
                int charValue;

                // Read characters until the end of the file is reached
                while ((charValue = fileReader.read()) != -1) {
                    char character = (char) charValue;
                    // Check if the character is not a whitespace (e.g., space, tab, newline)
                    if (!Character.isWhitespace(character)) {
                        characterCount++;
                    }
                }

                // Close the file reader
                fileReader.close();

                System.out.println("Number of non-whitespace characters in the file: " + characterCount);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
