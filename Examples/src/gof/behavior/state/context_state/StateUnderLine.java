package gof.behavior.state.context_state;

/**
 * Created by Gal on 8/25/2017.
 */
public class StateUnderLine implements State {
    @Override
    public void writeName(Context context, String name) {
        System.out.println("____" + name + "___");
    }
}
