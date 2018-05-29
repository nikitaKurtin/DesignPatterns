package gof.behavior.state.context_state;

/**
 * Created by Gal on 8/25/2017.
 */
public class StateMultiUpperCase implements State {
    private int count = 0;

    @Override
    public void writeName(Context context, String name) {
        System.out.println(name.toUpperCase());
        if (count++ >= 1) {
            context.setState(new StateLowerCase());
        }
    }
}
