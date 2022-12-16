
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Enemy<Ennemi> extends Combatant{
    /*
    private static final Enemy gobelin = new Enemy("Gobelin", 100, 5, 3, 100);
    private static final Enemy orque = new Enemy("Orque", 200, 8, 4, 12);
    private static final Enemy loupgarou = new Enemy("Loup-garou", 100, 10, 5, 12);
    private static final Enemy troll = new Enemy("Troll", 300, 15, 8, 13);
    private static final Enemy boss = new Enemy("Boss", 600, 20, 20, 14);

     */







    public Enemy(String name, int healthPoints, int strength, int mana, int defense) {
        super(name, healthPoints, strength, mana, defense);
    }

    public void attack(Hero hero) {
        System.out.print("L'ennemi : "+ hero.getName()   +" (HP = "+ hero.getHealthPoints());

        System.out.println(" ,defense = " + hero.getDefense() + " )");
        Scanner scan = new Scanner(System.in);

        //this.getArmory().get(choice).interaction(this,target);


    }




}