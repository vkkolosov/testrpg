package character.mob;

import character.action.EnemyActions;
import character.hero.Hero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Enemy implements EnemyActions {

    private String name;

    private int lvl;

    private int expfromkill;

    private int hp;
    private int maxhp;

    private int damage;

    @Override
    public void attack() {
        System.out.println("Враг атакует!");
    }

    @Override
    public void takeDamage(Hero hero) {
        int hp = getHp();
        System.out.println("Враг получает урон!");
        hp = hp - hero.getDamage();
        setHp(hp);
    }

    @Override
    public String toString() {
        return "Противник: [" +
                "name='" + getClass() + '\'' +
                ", hp=" + hp + '/' + maxhp +
                ", damage=" + damage +
                ']';
    }
}
