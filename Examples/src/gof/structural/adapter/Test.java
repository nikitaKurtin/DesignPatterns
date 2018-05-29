package gof.structural.adapter;

/**
 * Created by Gal on 8/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        //creates adaptee
        Adaptee adaptee = new Adaptee();

        //creates target with adapter
        Target target = new Adapter(adaptee);

        //call request using adapter's adaptee
        target.request();
    }


}
