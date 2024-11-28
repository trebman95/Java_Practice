public class Attributes {
    int x = 10;
    // final int x = 10;

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
    }

    // public static void main(String[] args) {
    // Main myObj = new Main();
    // myObj.x = 25; // will generate an error: cannot assign a value to a final
    // variable
    // System.out.println(myObj.x);
}
