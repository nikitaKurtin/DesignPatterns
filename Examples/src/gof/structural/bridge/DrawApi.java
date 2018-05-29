package gof.structural.bridge;

/**
 * Created by Gal on 8/26/2017.
 */
interface DrawingAPI {
    void drawCircle(double x, double y, double radius);

    void drawRect(double x, double y, double width, double height);
}

class RedAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("red circle: \n\tat x-" + x + " : y-" + y + "\n\tradius " + radius);
    }

    @Override
    public void drawRect(double x, double y, double width, double height) {
        System.out.println("Rectangle: \n\tat x-" + x + " : y-" + y + ",\n\tsize - " + width + ":" + height);
    }
}

class GreenAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("green circle: \n\tat x-" + x + " : y-" + y + ", radius " + radius);
    }

    @Override
    public void drawRect(double x, double y, double width, double height) {
        System.out.println("green Rectangle: \n\tat x-" + x + " : y-" + y + ", size " + width + ":" + height);
    }
}
