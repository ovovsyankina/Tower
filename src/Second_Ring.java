public class Second_Ring extends TowerDecorator {
    Second_Ring(TowerInterface ring){
        super(ring);
    }

    @Override
    public int cost(){ return 2; }

    @Override
    public String Build() { return ring.Build() + "  00|00\n"; }

    @Override
    public boolean isCorrect() {
        if (this.cost() < ring.cost()) return false;
        else return ring.isCorrect();
    }
}
