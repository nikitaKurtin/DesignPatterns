package gof.behavior.chain_of_responsibility.loggers;

/**
 * Created by Gal on 8/26/2017.
 */
public class StreamLogger extends AbstractLogger {
    public StreamLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("\u001B[34mStream Logger - " + message+"\u001B[0m");
    }
}
