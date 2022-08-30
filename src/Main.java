import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        //  Starting with Java 7, a better approach called try-with-resource has been introduced
        //  This works with the types that implement AutoClosable interface
        //  Reader is such a type

        Path filePath = Path.of("src/sample.txt");

        //  reader is a resource and this construct makes sure that the close on the resource is called
        //  multiple resources must be semicolon separated

        //  finally is implicit here
        //  so catch blocks are optional (throws claus is added to this method)
        try (Reader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);
            }

            System.out.println("Done!");
        }
    }
}