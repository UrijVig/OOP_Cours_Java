package Home_task.home_02.animal;

public class Animal {
    protected String animalName;
    protected String ownersName;
    protected Boolean isIll;
    protected Boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String animalName, String ownersName, Boolean isIll, Boolean isVaccinated) {
        this.animalName = animalName;
        this.ownersName = ownersName;
        this.isIll = isIll;
        this.isVaccinated = isVaccinated;
    }

    public Animal(String animalName, String ownersName) {
        this(animalName, ownersName, true, false);
    }

    public Animal() {
        this(null, null);
    }

    @Override
    public String toString() {
        String result = String.format("%s{name: %s, owner: %s, isIll: %s, isVaccinated: %s}", TYPE, animalName, ownersName, isIll, isVaccinated);
        if (this instanceof Swimable) {
            result += String.format(" swimmingSpeed = %.2f",((Swimable)this).swimmingSpeed());
        }
        if (this instanceof Runnable){
            result += String.format(" runningSpeed = %.2f",((Runnable)this).runningSpeed());
        }
        if (this instanceof Flyable){
            result += String.format(" flightSpeed = %.2f",((Flyable)this).flightSpeed());
        }
        return result;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public Boolean getIsIll() {
        return isIll;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setIsIll(Boolean isIll) {
        this.isIll = isIll;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    public String getType() {
        return TYPE;
    }
}