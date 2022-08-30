import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //  Exception and its subclasses except the hierarchy of RuntimeException
        //  are known as checked exceptions.

        //  Compiler enforces the handling of these checked exceptions as either
        //  explicit handling with try-catch
        //  or, mentioning the exception in the throws clause of the method
        //  If the called method has a throws clause of a checked exception
        //  then the caller must either handle that or in turn mention the exception
        //  in its throws clause. If an unchecked exception is mentioned in the throws clause,
        //  it has no binding on the caller, however. If multiple checked exceptions are possible,
        //  they must be comma separated in the throws clause. Handling some exceptions and mentioning
        //  others in the throws clause is possible as well.


        //  explicit handling
        try {
            foo();
        } catch (IOException e) {
            System.out.println("oops!");

            //  If an unchecked exception is thrown after catching the checked
            //  exception, it is called rethrow or exception masking

            //  example code:
            //  throw new RuntimeException(e);
        }
    }

    public static void foo() throws IOException {
        throw new IOException();
    }
}