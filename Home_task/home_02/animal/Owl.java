package Home_task.home_02.animal;

public class Owl extends Animal implements Flyable{

    @Override
    public double flightSpeed() {
        return Math.random()*80;
    }
}
