package gof.behavior.chain_of_responsibility.loggers;

/**
 * Created by Gal on 8/26/2017.
 */
public abstract class AbstractLogger {
    private int level;
    private AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void logMessage(int level, String message) {
        //if this level next than execute
        if (this.level <= level)
            write(message);
        else if (nextLogger != null) //if there a next logger execute it too
            nextLogger.logMessage(level, message);
        else //no more loggers in chain
            System.out.println();
    }

    public abstract void write(String message);
}
