package gof.behavior.observer2;

public class Tester {
    public static void main(String[] args) {
        Subject sbj = new Subject();
        new LengthObserver(sbj);

        sbj.attach(name -> {
            if("Gal".equalsIgnoreCase(name)){
                System.out.println("name is now Gal, which is cool");
            }
        });
    }
}
