package repository;

import character.hero.DefaultHero;

import java.io.*;

public class SaveFile {

    public void save(DefaultHero hero) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\main\\resources\\save.txt"));

            StringBuilder stringBuilder = new StringBuilder();

            String result = stringBuilder.append("heroname=").append(hero.getName()).append("\n")
                    .append("charclass=").append(hero.getCharclass()).append("\n")
                    .append("lvl=").append(hero.getLvl()).append("\n")
                    .append("exp=").append(hero.getExp()).append("\n")
                    .append("hp=").append(hero.getHp()).append("\n")
                    .append("maxhp=").append(hero.getMaxhp()).append("\n")
                    .append("damage=").append(hero.getDamage()).append("\n")
                    .append("chapter=0").append("\n")
                    .toString();

            writer.write(result);

            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
