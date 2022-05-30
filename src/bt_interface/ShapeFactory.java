package bt_interface;

import java.util.Scanner;

public class ShapeFactory {
    public Shape getShape (String inputShape) {
        Scanner scanner = new Scanner(System.in);
        int c,s,width,length;
        if (inputShape.equals("circle")){
            Circle obj = new Circle();
            System.out.println("Enter radius number:");
            c= scanner.nextInt();
            obj.draw(c);
            return obj;
        } else if (inputShape.equals("square")) {
            Square obj = new Square();
            System.out.println("Enter edge:");
            s = scanner.nextInt();
            obj.draw(s);
            return obj;
        }else if (inputShape.equals("rectangle")) {
            Rectangle obj = new Rectangle();
            System.out.println("Enter width and length of rectangle:");
            width = scanner.nextInt();
            length = scanner.nextInt();
            obj.draw(width,length);
            return obj;
        } else {
            System.out.println("Input data not match");
            return null;
        }

    }

}
