package Home_task.home_02.animal;

public class Dog extends Animal implements Swimable, Runnable{
    @Override
    public double runningSpeed() {
        return Math.random()*50;
    }

    @Override
    public double swimmingSpeed() {
        return Math.random()*4;
    }
}
