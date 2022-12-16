import java.util.Scanner;

public class GameScratch {
    public class Game {
        public static void Start() {

            Scanner scan = new Scanner(System.in);


            Combatant c = new Combatant("hh",55,5,5,5);
            System.out.println(c.getHealthPoints());

            System.out.println(c.getHealthPoints());
            int numHeroes = 4;
            for (int i =0; i<numHeroes; i++){
                System.out.print("Choisissez la classe du heros " + (i + 1) + " [1] Warrior, [2] Hunter,[3] Mage ou [4] Healer");
                String heroClass = scan.nextLine();

                switch (heroClass){
                    case "1":
                        Hero c1 = new Warrior("Warrior",100,20,0,50);
                        break;
                    case "2":
                        Hero c2 = new Hunter("Hunter",100,20,20,50);


                        break;

                    case "3":
                        Hero c3 = new Mage("Mage",100,20,0,50);

                        break;

                    case "4":
                        Hero c4 = new Healer("Healer",100,20,0,50);

                        break;


                }
            }
            Hero c1 = new Warrior("Warrior",100,20,0,50);
            Hero c2 = new Hunter("Hunter",100,20,20,50);
            Hero c3 = new Mage("Mage",100,20,0,50);
            Hero c4 = new Healer("Healer",100,20,0,50);

            Enemy enemy1 = new Enemy("enemy_1",100,40,0,60);
            Enemy enemy2 = new Enemy("enemy_2",100,40,0,60);
            Enemy enemy3 = new Enemy("enemy_3",100,60,10,70);
            Enemy enemy4 = new Enemy("enemy_4", 100, 70,20,75);
            Enemy boss = new Enemy("boss",100,70,30,85);


            //create weapon
            Sword sword = new Sword();
            Axe axe = new Axe();
            HealingStick healingStick = new HealingStick();

            //create item
            Apple apple = new Apple();
            ManaPotion manaPotion = new ManaPotion();


            c1.addArmory(sword);
            c1.addArmory(axe);
            c1.addInventory(apple);
            c1.addInventory(manaPotion);

            c2.addInventory(manaPotion);

            c3.addArmory(axe);
            c3.addArmory(healingStick);

            c4.addArmory(sword);


            Team team = new Team();
            team.addHero(c1);
            team.addHero(c2);
            team.addHero(c3);
            team.addHero(c4);




            Horde horde = new Horde();
            horde.addEnemy(enemy1);
            horde.addEnemy(enemy2);
            horde.addEnemy((enemy3));
            horde.addEnemy(enemy4);
            horde.addEnemy(boss);


            System.out.println("Your team :" );
            team.printHero();

            System.out.println();
            System.out.println("Enemy team :");
            horde.printEnemy();



            int turn = 0;
            while (horde.isDead()==false){
                System.out.println("\n");
                System.out.println("It's the turn of " + team.getHero(turn).getName());
                System.out.print("He has " + team.getHero(turn).getHealthPoints()  + " hp and " );
                System.out.println(team.getHero(turn).getMana() + " mana.");

                //action du hero
                boolean choiceDone = false;
                while (choiceDone==false){
                    System.out.println("Do you want to see the inventory(1), interact(2) or use an item(3)?");
                    System.out.print("Type 1, 2 or 3 : ");
                    int choice = scan.nextInt();
                    if (choice==1){
                        team.getHero(turn).printInventory();
                        System.out.println("\n");
                    }

                    else if (choice==2){
                        choiceDone = true;

                        System.out.println("Do you want to target your team(1) or the enemy team(2)? ");
                        System.out.print("Type 1 or 2 : ");
                        int choice2 = scan.nextInt();
                        if (choice2==1){
                            System.out.println("Your team is composed of : ");
                            team.printHero();
                            System.out.println("Witch one do you want to target? ");
                            System.out.print("Type his number");
                            int target = scan.nextInt();
                            team.getHero(turn).interact(team.getHero(target-1));
                        }

                        else if (choice2==2){
                            System.out.println("The enemy team is composed of : ");
                            horde.printEnemy();
                            System.out.println("Witch one do you want to target? ");
                            System.out.print("Type his number");
                            int target = scan.nextInt();
                            team.getHero(turn).interact(horde.getEnemy(target-1));
                            horde.getEnemy(target-1).updateAlive();
                            if (horde.getEnemy(target-1).getIsAlive()==false){
                                System.out.println(horde.getEnemy(target-1).getName() + " is dead");
                                horde.removeEnemy(horde.getEnemy(target-1));}


                        }

                        System.out.println("\n");

                    }

                    else if (choice==3){
                        choiceDone = true;
                        team.getHero(turn).consume();
                    }

                    else{
                        System.out.println("Instruction unclear");
                        System.out.println("\n");
                    }
                }


                //update turn
                if(turn< team.getSize()-1){turn++;}
                else {turn=0;}


            }


            System.out.println("\n" + "\n" + "\n");
            System.out.println("You defeated the enemy team");


        }
    }
}
