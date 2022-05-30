package bt_interface;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private int radius;

    //override draw() in interface
    public void draw(int radius) {
        System.out.println("//This is draw of Circle class");
        System.out.println("Area of circle: " + radius * PI);

    }
}

