package character.mob;

import character.action.EnemyActions;
import character.hero.Hero;

public class MobLvl1 extends Enemy implements EnemyActions {

    public MobLvl1() {
        setLvl(1);
        setHp(10);
        setMaxhp(10);
        setDamage(2);
    }


}
