package bt_interface;

public class Square implements Shape {

    //override draw() in interface
    public void draw(int edge) {
        System.out.println("//This is draw of Square class");
        System.out.println("Area of square: " + edge*edge);

    }

}