

public class Main {
    public static void main(String[] args) {
        System.out.println(foo());
    }

    public static String foo() {
        return foo();
    }

    public static String bar() {
        String name = null;
        return name.toUpperCase();

        //  When the exception is thrown here,
        //  it doesn't return to the call site (in foo()), but it will
        //  return unceremoniously to the JVM, where the runtime has a
        //  global exception handler
    }
}