package other_exercises.mvc_soldier.soldier;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Model> soldiers;
    private ArrayList<TextView> views;


    public Controller() {
        soldiers = new ArrayList<>();
        views = new ArrayList<>();
    }

    public void addModel(Model m) {
        if (m != null) soldiers.add(m);
    }

    public void updateViews() {
        System.out.println("printing...");
        views.clear();
        for (Model s : soldiers) {
            views.add(new TextView(s.toString()));
        }

        presentUI();
    }

    public void presentUI() {
        System.out.println("Presenting UI");

        for (TextView v : views) {
            v.present();
        }

        System.out.println("_____________");
    }
}
