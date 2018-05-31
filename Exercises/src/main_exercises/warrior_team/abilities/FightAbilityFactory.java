package main_exercises.warrior_team.abilities;

/**
 * Factory Pattern to handle creating new abilities
 * Flyweight to cache abilities to lower memory footprint
 */
public class FightAbilityFactory {

    private static FightAbilityFactory instance;
    //private final HashMap<String, FightAbility> _cache = new HashMap<>();

    //singleton
    private FightAbilityFactory() {
    }

    //lazy loading
    public static FightAbilityFactory getInstance() {
        if (instance == null)
            instance = new FightAbilityFactory();
        return instance;
    }

    //regular factory method with caching to flyweight
    public FightAbility getAbility(String ability_name) {
        //if item is already in cache than return it
//        if (_cache.containsKey(ability_name)) {
//            return _cache.get(ability_name);
//        }

        switch (ability_name.toLowerCase()) {
            case "gun":
            case "shooting":
//                _cache.put(ability_name, new Shooting());
                return new Shooting();
            case "cannon":
            case "ioncannon":
                return IONCannon.getIONCannon();

            case "kick":
            case "kicking":
//                _cache.put(ability_name, new Kicking());
                return new Kicking();
            case "punch":
            case "boxing":
            default:
//                _cache.put(ability_name, new Boxing());
                return new Boxing();
        }

//        return _cache.get(ability_name);
    }
}