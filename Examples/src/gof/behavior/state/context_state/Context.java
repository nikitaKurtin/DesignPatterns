package gof.behavior.state.context_state;

/**
 * Created by Gal on 8/25/2017.
 */
public class Context {
    private State state;

    public Context() {
        setState(new StateLowerCase());
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
