import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new RecordNotFoundException("Could not find the record!");
        } catch (RecordNotFoundException rnf) {
            System.out.println(rnf.getMessage());
        }
    }
}