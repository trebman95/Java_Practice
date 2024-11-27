public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        anotherOne(new String[] {});
        nested(new String[] {});
    }

    public static void anotherOne(String[] args) {
        for (int i = 0; i < 5; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void nested(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
    }
}
