public class First_Ring extends TowerDecorator {
    First_Ring(TowerInterface ring){
        super(ring);
    }

    @Override
    public int cost(){ return 1; }

    @Override
    public String Build() { return ring.Build() + "   0|0\n"; }

    @Override
    public boolean isCorrect() {
        if (this.cost() < ring.cost()) return false;
        else return ring.isCorrect();
    }
}
