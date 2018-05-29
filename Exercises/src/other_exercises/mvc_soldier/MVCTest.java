package other_exercises.mvc_soldier;


import other_exercises.mvc_soldier.soldier.Controller;
import other_exercises.mvc_soldier.soldier.Model;

public class MVCTest {
    public static void main(String[] args) {
//        TextView view = new TextView();
//        Controller controller = new Controller(view);
//        Model gal = new Model(1, "gal", "Samar");
//        controller.addModel(gal);
//        controller.updateViews();
//
//        controller.setSoldierRank(0, "Turai");
//        controller.addModel(new Model(2, "Lera", "RavSamal"));
//        controller.updateViews();

        Controller controller = new Controller();
        controller.addModel(new Model(1, "Gal", "Citizen"));
        controller.addModel(new Model(12121, "bubu", "Smar"));
        controller.addModel(new Model(624, "Groot", "Tree"));
        controller.addModel(new Model(-10, "Deadpool", "Awesome"));
        controller.addModel(new Model(100, "Nikita", "Citizen"));

        controller.presentUI();

        controller.updateViews();
    }
}
