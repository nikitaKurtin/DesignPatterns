package gof.structural.flyweight;

/**
 * Created by Gal on 8/24/2017.
 */
public class FlyweightTest {
    private static String[] colors = {"Red", "Green", "Blue", "Cyan", "Orange"};

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            Rectangle rectangle = Rectangle.getRectangle(getRandomColor());
            rectangle.draw(getRandomSize(), getRandomSize());
        }

        System.out.println("number of rectangle objects created: " + Rectangle.count);

        long time = System.currentTimeMillis() - startTime;
        System.out.println(time);
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomSize() {
        return (int) (Math.random() * 100);
    }
}
