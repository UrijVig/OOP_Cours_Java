package Home_task.home_02.human;

import Home_task.home_02.animal.Animal;

import java.util.Random;

public class Doctor extends Human {
    private boolean needHelp;

    public Doctor(String name) {
        super(name);
    }

    public void checkup(Animal animal) {
        Random random = new Random();
        int result = random.nextInt(2);
        if (result != 0) animal.setIsIll(true);
    }

    public void heal(Animal animal, Nurse nurse) {
        if (animal.getIsIll()) {
            Random random = new Random();
            int result = random.nextInt(3);
            if (result != 0) {
                this.needHelp = true;
                if (!nurse.getEmployment()) {
                    nurse.helpTheDoctor(this);
                }
            }
            animal.setIsIll(false);
        }
    }

    public boolean isNeedHelp() {
        return needHelp;
    }

    public void setNeedHelp(boolean needHelp) {
        this.needHelp = needHelp;
    }
}
