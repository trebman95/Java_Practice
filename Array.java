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
        multiDimension(new String[] {});
        multiChange(new String[] {});
        multiDimensionLoop(new String[] {});
        multiForEach(new String[] {});
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

    public static void multiDimension(String[] args) {
        int[][] myNums = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNums[0][2]);
    }

    public static void multiChange(String[] args) {
        int[][] myNumbs = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        myNumbs[0][2] = 9;
        System.out.println(myNumbs[0][2]);
    }

    public static void multiDimensionLoop(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                System.out.println(numbers[i][j]);
            }
        }
    }

    public static void multiForEach(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] row : numbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }

}
