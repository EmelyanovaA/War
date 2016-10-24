
class Archer extends Unit implements Fighter, Movable {

    @Override
    public void attack() {
        Attack a = new Attack(20);
    }

    @Override
    public void moveTo() {

    }

    @Override
    public void stopMove() {

    }
}
