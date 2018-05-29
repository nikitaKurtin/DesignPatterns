package gof_exercisers.factory_soldier;

import gof_exercisers.factory_soldier.soldier.Soldier;
import gof_exercisers.factory_soldier.soldier.SoldierFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SoldierFactory factory = new SoldierFactory();

        Soldier adam = factory.createSoldier("adam",97);
        Soldier soldi = factory.createSoldier("Simha", 64);
        Soldier kim = factory.createSoldier("Kim", 45);

        adam.serve();
        kim.serve();
        soldi.serve();
    }
}
