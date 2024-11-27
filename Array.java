public class Array {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "Chevy", "Honda", "Nissan" };
        int[] myNum = { 1, 2, 3, 4 };
        System.out.println(cars[0]);
        System.out.println(myNum.length);
        System.out.println(myNum[2]);

        change(new String[] {});
        loopArray(new String[] {});
        loopForEach(new String[] {});
    }

    public static void change(String[] args) {
        String[] cars = { "Volvo", "Chevy", "Honda", "Nissan" };
        cars[1] = "Opel";
        System.out.println(cars[1]);
    }

    public static void loopArray(String[] args) {
        String[] names = { "Julian", "Mariah", "Jonathan", "Bethany" };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void loopForEach(String[] args) {
        String[] animals = { "Horse", "Giraffe", "Monkey", "Reptile" };
        for (String i : animals) {
            System.out.println(i);
        }
    }

}
