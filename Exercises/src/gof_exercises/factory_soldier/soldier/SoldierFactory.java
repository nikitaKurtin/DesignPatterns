package gof_exercises.factory_soldier.soldier;

public class SoldierFactory {
    public Soldier createSoldier(String name, int profile) {
        switch (profile) {
            case 97:
                return new Kravi(name, Rank.Turai);
            case 82:
            case 72:
                return new Tomeh(name, Rank.Turai);
            case 64:
            case 45:
            case 24:
                return new Jobnik(name, Rank.Turai);
            case 21:
                throw new RuntimeException("can NOT be with profile 21");
            default:
                return new Jobnik(name, Rank.Turai);
        }
    }
}
