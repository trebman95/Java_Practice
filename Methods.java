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

    public static void main(String[] args) {
        myMethod();
        paramArgum("Jillian", 27);
        ifElse(27);
    }
}
