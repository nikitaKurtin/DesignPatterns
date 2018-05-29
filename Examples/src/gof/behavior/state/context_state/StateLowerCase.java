package gof.behavior.state.context_state;

/**
 * Created by Gal on 8/25/2017.
 */
public class StateLowerCase implements State {
    @Override
    public void writeName(Context context, String name) {
        //logic
        System.out.println(name.toLowerCase());

        //changing state
        context.setState(new StateMultiUpperCase());
    }
}
