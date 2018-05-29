package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * BuilderTest
 */
public class CompositeTest {
    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Rect rect1 = new Rect();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite instances
        Layout mainLayout = new Layout();
        Layout layout_2 = new Layout();
        Layout layout3 = new Layout();

        //Composes the graphics
        layout_2.add(ellipse1);
        layout_2.add(ellipse2);
        layout_2.add(rect1);

        layout3.add(ellipse4);

        mainLayout.add(layout_2);
        mainLayout.add(layout3);

        mainLayout.draw();
    }
}

