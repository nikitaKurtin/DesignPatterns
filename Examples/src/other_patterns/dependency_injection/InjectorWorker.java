package other_patterns.dependency_injection;

/**
 * Created by Gal on 8/25/2017.
 */
public class InjectorWorker {
    private SomeClass injectee;

    public InjectorWorker(SomeClass injectee) {
        this.injectee = injectee;
    }

    //method to work with injectee
    public void printInjectee() {
        System.out.println("injectee:\n\t" + injectee);
    }

    public void setInjectee(SomeClass injectee) {
        this.injectee = injectee;
    }
}
