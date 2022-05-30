package bt_interface;

import java.util.Scanner;

public class FactoryPattern {
    //public static String shapeName;

    public static void main(String[] args) {
        String shapeName;
        System.out.println("Enter shape name please (circle or rectangle or square): ");
        Scanner scanner = new Scanner(System.in);
        shapeName = scanner.nextLine();
        ShapeFactory obj = new ShapeFactory();
        obj.getShape(shapeName);


    }
}