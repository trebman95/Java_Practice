public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(1969, "Mustang");
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }
}
