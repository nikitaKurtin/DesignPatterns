package gof_exercisers.factory_soldier.soldier;

class Jobnik extends Soldier {


    public Jobnik(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void serve() {
        System.out.println(name + ", Working on computer");
    }

    @Override
    String getSoldierType() {
        return "Jobnik";
    }
}
