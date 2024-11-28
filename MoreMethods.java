public class MoreMethods {
    public void fullThrottle() {
        System.out.println("Kick it into gear!");
    }

    public void speed(int maxSpeed) {
        System.out.println("My max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        MoreMethods myObj = new MoreMethods();
        myObj.fullThrottle();
        myObj.speed(10);
    }
}
