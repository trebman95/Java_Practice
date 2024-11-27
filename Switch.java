public class Switch {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
        }

        // Calling the second method to print out
        defaultAction(new String[] {});
    }

    public static void defaultAction(String[] args) {
        int time = 3;
        switch (time) {
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Bring on the weekend!!!");
                break;
        }
    }
}
