

public class Main {
    public static void main(String[] args) {
        try {
            //  Setting a trap for the exception
            System.out.println(foo());
        } catch (NullPointerException npe) {
            //  When NullPointerException is thrown anywhere
            //  down the call graph, this handler will catch it

            //  We can consider logging, recovery, graceful exit
            //  strategies here.

            //  catch block is like a method, which must take only
            //  one argument of the type Throwable (any of its descendants)
            System.out.println("Oops!");
        }

    }

    public static String foo() {
        return foo();
    }

    public static String bar() {
        String name = null;
        return name.toUpperCase();
    }
}