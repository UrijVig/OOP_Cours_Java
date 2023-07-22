package Home_task.home_02.animal;

public class Turtle extends Animal implements Swimable,Runnable{
    @Override
    public double swimmingSpeed() {
        return Math.random()*40;
    }

    @Override
    public double runningSpeed() {
        return Math.random()*15;
    }
}
