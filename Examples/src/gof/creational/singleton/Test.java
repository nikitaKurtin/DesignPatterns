package gof.creational.singleton;

/**
 * Created by Gal on 8/23/2017.
 */
public class Test {
    public static void main(String[] args) {
        MySingy singy = MySingy.getInstance();

        singy.setNumber(10);
        System.out.println("singy's number: " + singy.getNumber());

        MySingy otherRef = MySingy.getInstance();
        System.out.println("other reference number: " + otherRef.getNumber());
    }
}
