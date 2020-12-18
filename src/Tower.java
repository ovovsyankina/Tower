public class Tower {

    public static void main(String[] args) {
        TowerInterface pyramid1 = new Third_Ring(new Fourth_Ring(new Second_Ring(new First_Ring(new Ring()))));
        System.out.println(pyramid1.Build());
        System.out.println("Правильность пирамидки: " + pyramid1.isCorrect());

        TowerInterface pyramid2 = new Fourth_Ring(new Third_Ring(new Second_Ring(new First_Ring(new Ring()))));
        System.out.println("\n" + pyramid2.Build());
        System.out.println("Правильность пирамидки:  " + pyramid2.isCorrect());
    }
}
