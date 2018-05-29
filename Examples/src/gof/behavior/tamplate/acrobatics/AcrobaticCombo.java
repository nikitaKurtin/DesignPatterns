package gof.behavior.tamplate.acrobatics;

/**
 * Created by Gal on 8/24/2017.
 */
public abstract class AcrobaticCombo {
    protected abstract void firstAct();

    protected abstract void secondAct();

    protected abstract void thirdAct();

    public final void combo() {
        firstAct();
        secondAct();
        thirdAct();

        firstAct();
        System.out.println();
    }
}
