

public class Main {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();   //  Only Throwable objects can be thrown
        } catch (NullPointerException npe) {
            System.out.println("main: NullPointerException");
        } catch (ArithmeticException ae) {
            System.out.println("main: ArithmeticException");
        }

        //  Multiple catch blocks can be chained so long as:
        //  1. Same type is not repeated
        //  2. General exceptions do not precede the specific exceptions

        //  catch blocks of the exceptions that are not inheriting from one another
        //  (such as NullPointerException and ArithmeticException) can come in any order

        //  Please refer to Java Exception hierarchy: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html
    }
}