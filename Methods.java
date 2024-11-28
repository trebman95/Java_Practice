public class Methods {
    static void myMethod() {
        System.out.println("Hello World");
    }

    static void paramArgum(String fname, int age) {
        System.out.println(fname + " Refsnes" + " is " + age);
    }

    static void ifElse(int age) {
        if (age < 18) {
            System.out.println("Hey young buck!");
        } else {
            System.out.println("Damn, you are old!");
        }
    }

    static int returnValues(int x, int y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        paramArgum("Jillian", 27);
        ifElse(27);
        System.out.println(returnValues(5, 3));
        System.out.println("int: " + plusMethod(3, 5));
        System.out.println("double: " + plusMethod(4.3, 5.78));
    }

}
