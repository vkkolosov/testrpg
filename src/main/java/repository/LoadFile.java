package repository;

import character.hero.DefaultHero;

import java.io.*;

public class LoadFile {

    public DefaultHero load() {

        DefaultHero defaultHero = new DefaultHero();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\resources\\save.txt"));

            defaultHero.setName(getData(reader.readLine()));
            defaultHero.setCharclass(getData(reader.readLine()));
            defaultHero.setLvl(Integer.parseInt(getData(reader.readLine())));
            defaultHero.setExp(Integer.parseInt(getData(reader.readLine())));
            defaultHero.setHp(Integer.parseInt(getData(reader.readLine())));
            defaultHero.setMaxhp(Integer.parseInt(getData(reader.readLine())));
            defaultHero.setDamage(Integer.parseInt(getData(reader.readLine())));

            reader.close();

            return defaultHero;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private String getData(String data) {
        String[] array = data.split("=");
        String result = array[1];
        if (result.equals("false")) {
            return null;
        }
        return result;
    }

}
