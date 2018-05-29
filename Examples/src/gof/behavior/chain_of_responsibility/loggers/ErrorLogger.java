package gof.behavior.chain_of_responsibility.loggers;

/**
 * Created by Gal on 8/26/2017.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.err.println("Error Logger - " + message);
    }
}
