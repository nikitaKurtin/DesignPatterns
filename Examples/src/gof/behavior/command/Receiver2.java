package gof.behavior.command;

/**
 * Receiver here can be some kind of window app
 */
public class Receiver2 {
    public void presentView(int width, int height) {
        System.out.println("window with height: " + height + ", width: " + width);
    }
}
