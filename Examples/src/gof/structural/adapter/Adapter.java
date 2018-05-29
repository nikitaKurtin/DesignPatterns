package gof.structural.adapter;

/**
 * Created by Gal on 8/24/2017.
 */
public class Adapter implements Target {
    private final Adaptee mAdaptee;

    Adapter(Adaptee mAdaptee) {
        this.mAdaptee = mAdaptee;
    }

    @Override
    public void request() {
        mAdaptee.specialRequest();
    }
}
