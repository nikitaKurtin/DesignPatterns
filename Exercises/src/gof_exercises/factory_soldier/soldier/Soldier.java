package gof_exercises.factory_soldier.soldier;

public abstract class Soldier {
    protected String name;
    protected Rank rank;

    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public void upRank() {
        var ranks = Rank.values();
        var index = rank.ordinal();

        if (index + 1 < ranks.length) rank = ranks[index + 1];
        else throw new IllegalStateException("rank is too high");
    }

    public abstract void serve();

    abstract String getSoldierType();
}
