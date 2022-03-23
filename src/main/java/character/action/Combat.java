package character.action;

import character.hero.Hero;
import character.mob.Enemy;

public class Combat {

    public static void fight(Enemy enemy, Hero hero) {
        while (hero.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("--------------------------------------------------------");
            System.out.println(hero);
            System.out.println(enemy);
            hero.attack();
            enemy.takeDamage(hero);
            System.out.println(enemy.toString());
            enemy.attack();
            hero.takeDamage(enemy);
            System.out.println(hero.toString());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
