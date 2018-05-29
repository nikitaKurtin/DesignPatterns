package gof.behavior.tamplate.acrobatics;

/**
 * Created by Gal on 8/24/2017.
 */
public class Alex extends AcrobaticCombo {
    @Override
    protected void firstAct() {
        System.out.println("three flip & twist flip");
    }

    @Override
    protected void secondAct() {
        System.out.println("falling");
    }

    @Override
    protected void thirdAct() {
        System.out.println("Double front flip");
    }
}
