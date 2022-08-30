

public class Main {
    public static void main(String[] args) {
        //  Exceptions are thrown because of logical mistakes
        //  or underlying system conditions or due to unmet
        //  requirements of APIs

        String message = null;

        String upper = message.toUpperCase();   //  NullPointerException is thrown here

        //  This exception is unhandled and hence reaches the JVM
        //  wherein the runtime terminates the program with an error
        //  (a non-zero exit)

        //  An exception is an object that encapsulates message related
        //  to the exception and also the call stack information.
    }
}