public class Food extends Consumable {

    @Override
    public void consume(Combatant c1) {
        c1.updateHP(this.heal);

    }
}