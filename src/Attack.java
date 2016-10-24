
public class Attack {
    int damage;
    Attack(int damage){
        this.damage=damage;
    }
    void attack(Unit unit){
    unit.currentHP -= damage;
    }
}
