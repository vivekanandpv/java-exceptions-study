import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new RecordNotFoundException("Could not find the record!");
        } catch (RecordNotFoundException rnf) {
            System.out.println(rnf.getMessage());
        } finally {
            System.out.println("This runs anyway!");

            //  finally block is optional
            //  there can only be one finally block per try block
            //  finally must come after all catch blocks
            //  try must accompany catch or finally or both
            //  use finally to release the system resources such as file handles
        }
    }
}