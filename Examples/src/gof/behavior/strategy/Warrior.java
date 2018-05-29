package gof.behavior.strategy;

import gof.behavior.strategy.abilities.FightAbility;
import gof.behavior.strategy.abilities.FightingAbilityFactory;

/**
 * Created by Gal on 8/24/2017.
 */
class Warrior {

    private FightAbility ability;

    Warrior() {
        this.ability = FightingAbilityFactory.createAbility("");
    }

    void attack() {
        ability.engage();
    }

    void setAbility(String ability) {
        this.ability = FightingAbilityFactory.createAbility(ability);
    }
}
