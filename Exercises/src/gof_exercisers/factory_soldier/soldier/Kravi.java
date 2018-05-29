package gof_exercisers.factory_soldier.soldier;

class Kravi extends Soldier {

    public Kravi(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void serve() {
        System.out.println(name + ", Fighter fighting war with guns");
    }

    @Override
    String getSoldierType() {
        return "Kravi";
    }
}
