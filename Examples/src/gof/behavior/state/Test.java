package gof.behavior.state;

import gof.behavior.state.context_state.Context;
import gof.behavior.state.context_state.StateUnderLine;

/**
 * Created by Gal on 8/25/2017.
 */
public class Test {
    public static void main(String[] args) {
        Context c = new Context();

        c.writeName("Gal");
        c.writeName("Gal");
        c.writeName("Gal");
        c.writeName("Gal");
        c.writeName("Gal");
        c.setState(new StateUnderLine());
        c.writeName("Gal");
    }
}
