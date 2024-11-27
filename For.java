public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        anotherOne(new String[] {});
    }

    public static void anotherOne(String[] args) {
        for (int i = 0; i < 5; i = i + 2) {
            System.out.println(i);
        }
    }
}
