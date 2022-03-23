package character.hero;

import character.action.HeroActions;
import character.mob.Enemy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Hero implements HeroActions {

    private String name;
    private String charclass;

    private int lvl;

    private int exp;

    private int maxhp;
    private int hp;

    private int damage;

    @Override
    public void attack() {
        System.out.println("Герой атакует!");
    }

    @Override
    public void takeDamage(Enemy enemy) {
        int hp = getHp();
        System.out.println("Герой получает урон!");
        hp = hp - enemy.getDamage();
        setHp(hp);
    }

    @Override
    public String toString() {
        return "Ваш персонаж: [" +
                "name='" + name + '\'' +
                ", class=" + charclass +
                ", lvl=" + lvl +
                ", exp=" + exp +
                ", hp=" + hp + '/' + maxhp +
                ", damage=" + damage +
                ']';
    }
}
