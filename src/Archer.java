
class Archer extends Unit implements Fighter, Movable {

    @Override
    public void attack(Unit unit) {
        Attack a = new Attack(20);
        a.attack(unit);
    }

    @Override
    public void moveTo() {

    }

    @Override
    public void stopMove() {

    }
}
