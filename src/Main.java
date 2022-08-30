

public class Main {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();   //  Only Throwable objects can be thrown
        } catch (NullPointerException npe) {
            System.out.println("main: Oops!");
        }
    }
}