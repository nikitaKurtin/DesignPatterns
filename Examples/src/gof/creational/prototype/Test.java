package gof.creational.prototype;

/**
 * Created by Gal on 8/23/2017.
 */
public class Test {
    public static void main(String[] args) {
        BigClass bc1 = BigClass.createClone(),
                bc2 = BigClass.createClone(),
                bc3 = BigClass.createClone(),
                bc4 = BigClass.createClone();

        bc1.setNumber(40);
        bc2.setNumber(2);
        bc4.setNumber(0);
        System.out.println(bc1);
        bc4.setBubu(new Object());
        System.out.println(bc2);
        System.out.println(bc3);
        System.out.println(bc4);
    }
}


final class BigClass implements Cloneable {
    private int number;
    private Object bubu, groot;

    private static final BigClass prototype = new BigClass(23, new Object(), new Object());

    private BigClass(int number, Object bubu, Object groot) {
        this.number = number;
        this.bubu = bubu;
        this.groot = groot;
    }

    //Getter
    int getNumber() {
        return number;
    }

    //Setters
    void setNumber(int number) {
        this.number = number;
    }

    public void setGroot(Object groot) {
        this.groot = groot;
    }

    void setBubu(Object bubu) {
        this.bubu = bubu;
    }

    @Override
    public String toString() {
        return "number is: " + number + "\nbubu is: " + bubu + "\ngroot is: " + groot;
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException("Clone not supported");
        }
    }

    //static
    static BigClass createClone() {
            return (BigClass) prototype.clone();
//            return new BigClass(prototype.number, prototype.bubu, prototype.groot);
    }
}
