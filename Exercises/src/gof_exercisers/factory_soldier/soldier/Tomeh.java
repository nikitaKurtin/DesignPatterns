package gof_exercisers.factory_soldier.soldier;

class Tomeh extends Soldier {

    public Tomeh(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void serve() {
        System.out.println(name + ", Fighting wars with fighters");
    }

    @Override
    String getSoldierType() {
        return "Tomeh";
    }
}
