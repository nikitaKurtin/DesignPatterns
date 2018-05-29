package gof.structural.bridge;

/**
 * Created by Gal on 8/26/2017.
 */
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(final DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();

    public abstract void resizeByPercentage(final double pct);
}

class Circle extends Shape {
    private double x, y, radius;

    public Circle(final double x, final double y, final double radius, final DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // low-level i.e. Implementation specific
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // high-level i.e. Abstraction specific
    public void resizeByPercentage(final double pct) {
        radius *= (1.0 + pct / 100.0);
    }
}

class Rectangle extends Shape {
    private double x, y, width, height;

    protected Rectangle(double x, double y, double width, double height, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingAPI.drawRect(x, y, width, height);
    }

    @Override
    public void resizeByPercentage(double pct) {
        double factor = (1.0 + pct / 100);
        width *= factor;
        height *= factor;
    }
}