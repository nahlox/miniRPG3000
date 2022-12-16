
public class Magical_Weapon extends Weapon{

    int heal;
    int mana;
    int damage;
    int cost;


    @Override
    public void interaction(Combatant attacker, Combatant target) {
        int damage = this.damage;

        if(attacker instanceof Warrior){damage*=2;}




        //int damageDealt = (int)Math.round(damage*(100-target.getDefense())/100);

        target.updateHP(-damage);

        //message for terminal game
        System.out.print(attacker.getName() + " dealt " + damage+" to " + target.getName() );
        System.out.print(" with his " + this.name + ". ");
        System.out.println( target.getName() + " now have " + target.getHealthPoints() + " hp.");

    }
}