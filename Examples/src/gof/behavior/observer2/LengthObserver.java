package gof.behavior.observer2;

public class LengthObserver implements Subject.OnNameChanged{

    public LengthObserver(Subject subject) {
        subject.attach(this); //dependency injection to attach on creation
    }

    @Override
    public void onUpdate(String name) {
        if(name.length() >= 5) System.out.println("name has at least 5 letters");


    }
}
