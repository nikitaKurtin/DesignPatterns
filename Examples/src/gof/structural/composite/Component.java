package gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * base interface
 */
interface Component {

    //Prints the graphic.
    void draw();
}

/**
 * Composite Class
 */
class Layout implements Component {

    //Collection of child graphics.
    private List<Component> childGraphics = new ArrayList<>();

    //Prints the graphic.
    public void draw() {
        for (Component graphic : childGraphics) {
            graphic.draw();
        }
    }

    //Adds the graphic to the composition.
    void add(Component graphic) {
        childGraphics.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Component graphic) {
        childGraphics.remove(graphic);
    }
}

/**
 * implementations
 */
class Ellipse implements Component {

    //Prints the graphic.
    @Override
    public void draw() {
        System.out.println("Ellipse");
    }
}

class Rect implements Component {

    //Prints the graphic.
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}