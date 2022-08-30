

public class Main {
    public static void main(String[] args) {
        try {
            //  Setting a trap for the exception
            System.out.println(foo());
        } catch (NullPointerException npe) {
            //  Exception object npe for example contains
            //  two critical information pieces: message and call stack
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }

    }

    public static String foo() {
        return bar();
    }

    public static String bar() {
        String name = null;
        return name.toUpperCase();
    }
}