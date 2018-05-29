package other_patterns.dependency_injection;

import java.io.IOException;

/**
 * Created by Gal on 8/23/2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        SomeClass sm = new SomeClass("Class number 1");
        InjectorWorker injecter = new InjectorWorker(sm);

        injecter.printInjectee();

        injecter.setInjectee(new SomeClass("Class no 2"));
        injecter.printInjectee();
    }
}
