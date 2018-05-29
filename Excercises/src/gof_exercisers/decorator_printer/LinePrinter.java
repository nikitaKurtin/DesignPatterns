package gof_exercisers.decorator_printer;

/**
 * Created by Gal on 8/24/2017.
 */
class LinePrinter {
    private SimplePrinter mSp;

    LinePrinter(SimplePrinter simplePrinter) {
        this.mSp = simplePrinter;
    }

    void linePrint(String line) {
        mSp.printChar('\n');
        for (int i = 0; i < line.length(); i++) {
            mSp.printChar(line.charAt(i));
        }
    }

    void printLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            mSp.printChar(line.charAt(i));
        }
        mSp.printChar('\n');
    }

    void printNumericChar(char character) {
        if (character >= 48 && character <= 57)
            printChar(character);
        else
            printLine(character + " is NOT a numeric character");
    }

    void printChar(char c) {
        mSp.printChar(c);
    }


}
