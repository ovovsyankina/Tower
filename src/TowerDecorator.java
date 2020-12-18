public abstract class TowerDecorator implements TowerInterface {

    TowerInterface ring;

    TowerDecorator(TowerInterface ring){
        this.ring = ring;
    }

}