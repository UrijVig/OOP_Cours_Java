package Home_task.home_02.animal;

public class Cat extends Animal implements Runnable{
    @Override
    public double runningSpeed() {
        return Math.random()*48;
    }
}
