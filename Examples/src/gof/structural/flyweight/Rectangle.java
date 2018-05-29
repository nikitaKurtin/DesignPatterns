package gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gal on 8/25/2017.
 */
public class Rectangle {

    private static final Map<String, Rectangle> rectanglesCache = new HashMap<>();

    static Rectangle getRectangle(String color) {
        //*/
        if (!rectanglesCache.containsKey(color))
            rectanglesCache.put(color, new Rectangle(color));

        return rectanglesCache.get(color);
        /*/
        return new Rectangle(color);
        //*/
    }


    public static int count = 0;
    private String color;

    Rectangle(String color) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        this.color = color;
        System.out.println("Creating Rectangle with color: " + color);
        count++;
    }

    //no Setters, Rect is immutable

    //Getters
    String getColor() {
        return color;
    }

    void draw(int width, int height) {
        System.out.println("color: " + color + ", width:" + width + ", height:" + height);
    }
}
