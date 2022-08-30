import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path filePath = Path.of("src/sample.txt");
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath.toFile()));

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);
            }

            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Oops! we cannot do anything now...");
                }
            }
        }
    }
}