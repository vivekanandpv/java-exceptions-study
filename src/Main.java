

public class Main {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();   //  Only Throwable objects can be thrown
        } catch (RuntimeException re) {
            System.out.println("main: RuntimeException");
        }

        //  Since NullPointerException is a subclass of RuntimeException,
        //  catch block of RuntimeException consumes the NullPointerException
        //  provided such an exception is not handled already
    }
}