package gof.behavior.observer2;

import java.util.ArrayList;

public class Subject {

    private String name;

    private ArrayList<OnNameChanged> observers = new ArrayList<>();

    public void attach(OnNameChanged listener) {
        observers.add(listener);
    }

    public void setName(String name) {
        this.name = name;
        notifyNameChanged();
    }

    private void notifyNameChanged() {
        for (OnNameChanged o : observers) o.onUpdate(name);
    }


    public static interface OnNameChanged {
        void onUpdate(String name);
    }
}
