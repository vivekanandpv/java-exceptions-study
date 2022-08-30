//  Typically the custom exceptions have Exception suffix
//  extend Exception for a checked exception and RuntimeException for an unchecked exception
public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String message) {
        super(message);
    }
}
