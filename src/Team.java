
import java.util.ArrayList;


public class Team {

    ArrayList<Hero> team = new ArrayList<>();
    boolean dead = false;





    public int getSize(){return this.team.size();}


    public void addHero(Hero hero){
        this.team.add(hero);
    }

    public Hero getHero(int index){
        return this.team.get(index);
    }

    public boolean isDead() {
        return dead;
    }


    public void removeHero(Hero hero){
        this.team.remove(hero);
        if(this.team.size()==0){
            this.dead = true;
        }
    }

    public void printHero(){
        for (int i = 0; i<this.team.size(); i++){
            System.out.print(i+1 +") " + this.team.get(i).getName() + " : " +  this.team.get(i).getHealthPoints() + "hp, ");
            System.out.println(this.team.get(i).getMana() + " mana");
        }


    }





}