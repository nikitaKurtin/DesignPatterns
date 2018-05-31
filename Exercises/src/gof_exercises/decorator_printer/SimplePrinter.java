package gof_exercises.decorator_printer;

/**
 * Created by Gal on 8/24/2017.
 */
class SimplePrinter {
    private int count = 0;

    void printChar(char c) {
        System.out.print(c);
        count++;
    }

    int getCount() {
        return count;
    }
}
