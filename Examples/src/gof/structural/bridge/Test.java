package gof.structural.bridge;

/**
 * Created by Gal on 8/26/2017.
 */
public class Test {
    public static void main(String[] args) {
        //implementors
        DrawingAPI redApi = new RedAPI(),
                greenApi = new RedAPI();

        //abstractions
        Shape[] shapes = new Shape[] {
                new Circle(1, 2, 3, redApi),
                new Circle(5, 7, 11, greenApi),
                new Rectangle(1, 2, 10,12, redApi),
                new Circle(5, 7, 11, greenApi),
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5); //polymorphic call on abstraction
            shape.draw(); //polymorphic call to implementor
        }
    }
}
