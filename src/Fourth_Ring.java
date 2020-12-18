public class Fourth_Ring extends TowerDecorator {
    Fourth_Ring(TowerInterface ring){
        super(ring);
    }

    @Override
    public int cost(){ return 4; }

    @Override
    public String Build() { return ring.Build() + "0000|0000\n"; }

    @Override
    public boolean isCorrect() {
        if (this.cost() < ring.cost()) return false;
        else return ring.isCorrect();
    }
}