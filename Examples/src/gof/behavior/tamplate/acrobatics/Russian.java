package gof.behavior.tamplate.acrobatics;

/**
 * Created by Gal on 8/24/2017.
 */
public class Russian extends AcrobaticCombo {
    @Override
    protected void firstAct() {
        System.out.println("Triple back flip");
    }

    @Override
    protected void secondAct() {
    }

    @Override
    protected void thirdAct() {
        System.out.println("twist flip, flick flack & double twist double flip");
    }
}
