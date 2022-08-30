

public class Main {
    public static void main(String[] args) {
        try {
            foo();
        } catch (NullPointerException npe) {
            System.out.println("main: Oops!");
        }

    }

    public static void foo() {
        try {
            bar();
        } catch (NullPointerException npe) {
            System.out.println("foo: Oops!");
        }
    }

    public static void bar() {
        String name = null;
        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException npe) {
            System.out.println("bar: Oops!");
        }

    }
}