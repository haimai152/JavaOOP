package bt_interface;

public class Rectangle implements Shape {

    public void draw(int w, int l) {
        System.out.println("//This is draw() of Rectangle class");
        System.out.println("Area of rectangle: " + w * l);
    }
}
