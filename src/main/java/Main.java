import character.action.Combat;
import character.hero.Archer;
import character.hero.DefaultHero;
import character.hero.Knight;
import character.mob.Enemy;
import character.mob.MobLvl1;
import input.MyReader;
import repository.LoadFile;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Chapter 1

        //инициализация
        LoadFile fileloader = new LoadFile();
        DefaultHero mainhero = fileloader.load();
        MyReader myreader = new MyReader();
        String answer = "";
        String heroname = "";

        if (mainhero.getName() == null) {

            System.out.println("Приветствую тебя, странник.");
            System.out.println("В эти темные времена, времена раздоров и царства несправедливости, правления безумца короля и слабости империи нам как никогда нужен герой, ");
            System.out.println("способный на великие подвиги, и в силах которого изменить ход истории. Если ты один из них, то назови же себя.");

            heroname = myreader.readLine();
            mainhero.setName(heroname);

            //Thread.sleep(1000);
            System.out.println("Итак, " + mainhero.getName() + ". Впереди тебя ждет долгая и опасная дорога.");

        }

        Thread.sleep(1000);
        System.out.println(mainhero);

        System.out.println("Итак, величавый герой, вспомните какими навыками вы обладали, придя сюда.");
        System.out.println("Выберите класс: Лучник(Л); Воин(В)");

        while (!answer.equals("Л") && !answer.equals("В"))
            answer = myreader.readLine();
        switch (answer) {
            case "Л":
                mainhero = new Archer();
                break;
            case "В":
                mainhero = new Knight();
                break;
            default:
                System.out.println("Выберите персонажа");
                break;
        }

        mainhero.setName(heroname);

        Thread.sleep(1000);
        System.out.println("Чтобы вспомнить выши боевые навыки проведите тренировочный бой");
        Thread.sleep(1000);
        System.out.println("Сражение с врагом");
        Thread.sleep(1000);
        Enemy enemy1 = new MobLvl1();
        Combat.fight(enemy1, mainhero);


        //SaveFile saveFile = new SaveFile();
        //saveFile.save(mainhero);


    }

}
