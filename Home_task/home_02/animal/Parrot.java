package Home_task.home_02.animal;

public class Parrot extends Animal implements Flyable, Runnable{
    @Override
    public double flightSpeed() {
        return Math.random()*110;
    }

    @Override
    public double runningSpeed() {
        return Math.random()*10;
    }
}
