package gof.behavior.chain_of_responsibility;

import gof.behavior.chain_of_responsibility.loggers.AbstractLogger;
import gof.behavior.chain_of_responsibility.loggers.ConsoleLogger;
import gof.behavior.chain_of_responsibility.loggers.ErrorLogger;
import gof.behavior.chain_of_responsibility.loggers.StreamLogger;

/**
 * Created by Gal on 8/26/2017.
 */
public class Test {
    public static void main(String[] args) {
        AbstractLogger loggerChain = initLoggers();

        loggerChain.logMessage(2, "file created");
        loggerChain.logMessage(1, "file not found exception");
        loggerChain.logMessage(0, "my own print");


        //adding new logger in run time
        AbstractLogger fileLogger = new AbstractLogger(3) {
            @Override
            public void write(String message) {
                System.out.println("File logger - " + message);
            }
        };

        //put new logger in start of chain
        fileLogger.setNextLogger(loggerChain);

        fileLogger.logMessage(2, "Stream ended");
        fileLogger.logMessage(3, "writing to file");
    }

    public static AbstractLogger initLoggers() {
        AbstractLogger fileLogger = new StreamLogger(2);
        AbstractLogger errorLogger = new ErrorLogger(1);
        AbstractLogger consoleLogger = new ConsoleLogger(0);

        fileLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(consoleLogger);

        return fileLogger;
    }
}
