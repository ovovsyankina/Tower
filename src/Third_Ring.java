public class Third_Ring extends TowerDecorator {
    Third_Ring(TowerInterface ring){
        super(ring);
    }

    @Override
    public int cost(){ return 3; }

    @Override
    public String Build() { return ring.Build() + " 000|000\n"; }

    @Override
    public boolean isCorrect() {
        if (this.cost() < ring.cost()) return false;
        else return ring.isCorrect();
    }
}
