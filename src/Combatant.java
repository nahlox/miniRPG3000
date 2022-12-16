import java.util.ArrayList;



public class Combatant {


    private final String name;
    private int healthPoints;
    private final int strength;
    private  int mana;
    private final int defense;
    private  boolean isAlive;


    private int[] position;
    private final ArrayList<Consumable> inventory;
    private final ArrayList<Weapon> armory;



    public Combatant(String name,int healthPoints,int strength,int mana, int defense){
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.mana = mana;
        this.defense = defense;
        this.armory= new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.isAlive = true;

    }

    //getter

    public String getName(){return this.name;}

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getMana() {
        return this.mana;
    }

    public boolean getIsAlive(){return this.isAlive;}

    public ArrayList<Weapon> getArmory() {
        return this.armory;
    }

    public ArrayList<Consumable> getInventory() {
        return this.inventory;
    }




    //Update

    public void addArmory(Weapon weapon){
        this.armory.add(weapon);
    }

    public void deleteArmory(Weapon weapon){
        this.armory.remove(weapon);
    }

    public void addInventory(Consumable consumable){
        this.inventory.add(consumable);
    }

    public void deleteInventory(Consumable consumable){this.inventory.remove(consumable);}

    public void updateHP(int delta){
        this.healthPoints += delta;
    }

    public void updateMana(int delta){
        this.mana += delta;
    }

    public void updateAlive(){
        if(this.healthPoints<=0){
            this.isAlive = false;
        }
    }


    //print
    public void printInventory() {
        if (this.getInventory().size() == 0) {
            System.out.println("You don't have any item!");
        } else {
            System.out.print("You have : ");
            for (int i = 0; i < this.getInventory().size(); i++) {
                if (i == this.getInventory().size() - 1) {
                    System.out.print(this.getInventory().get(i).name + " .");
                } else {
                    System.out.print(this.getInventory().get(i).name + " / ");
                }

            }
            System.out.println();
        }

        System.out.print("In your armory you have : ");
        for (int i = 0; i < this.getArmory().size(); i++) {
            if (i == this.getArmory().size() - 1) {
                System.out.print(this.getArmory().get(i).name + " .");
            } else {
                System.out.print(this.getArmory().get(i).name + " / ");
            }

        }


    }
    public int faireAttaque(){
        int damage = this.strength *2;
        return damage;

    }
    public void recevoirDamage(int damage){
        int damage_recu = damage*((100 - this.defense*2)/100);
        this.healthPoints = this.healthPoints - damage_recu;
    }



}