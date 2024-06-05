// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car c = new Car("USZ", "2137", 2005, 21.37, 4.20);
        System.out.println(c.calculateFuelEfficiency());
        Truck t = new Truck("USZ", "2137", 2005, 21.37, 4.20, 69);
        System.out.println(t.calculateFuelEfficiency());
    }
}