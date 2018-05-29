package gof_exercisers.decorator_printer;

import java.io.IOException;

/**
 * Created by Gal on 8/24/2017.
 */
public class DecoratorTest {
    public static void main(String[] args) throws IOException {
        SimplePrinter sp = new SimplePrinter();
        sp.printChar('h');
        sp.printChar('e');
        sp.printChar('l');
        sp.printChar('l');
        sp.printChar('o');
        sp.printChar(' ');
        sp.printChar('w');
        sp.printChar('o');
        sp.printChar('r');
        sp.printChar('l');
        sp.printChar('d');
        sp.printChar('\n');

        System.out.println(sp.getCount());

        LinePrinter lp = new LinePrinter(sp);
        lp.printLine("hello world");
        lp.printLine("this is a new line");
        lp.printChar('s');
        lp.printChar('\n');

        System.out.println(sp.getCount());

        lp.printNumericChar('a');
        lp.printNumericChar('5');
    }
}
