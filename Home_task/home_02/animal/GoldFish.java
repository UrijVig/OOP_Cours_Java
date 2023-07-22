package Home_task.home_02.animal;

public class GoldFish extends Animal implements Swimable{
    @Override
    public double swimmingSpeed() {
        return Math.random()*1.8;
    }
}
