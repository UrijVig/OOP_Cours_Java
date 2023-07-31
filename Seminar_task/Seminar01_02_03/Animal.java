package Seminar_task.Seminar01_02_03;

public class Animal{
    protected String nameAnimal;
    protected String ownerName;
    protected String diagnosis;
    protected Boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String nameAnimal, String ownerName, String diagnosis, boolean isVaccinated) {
        this.diagnosis = diagnosis;
        this.nameAnimal = nameAnimal;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;
    }

    public Animal() {
    }
    public String getNameAnimal() {
        return nameAnimal;
    }
    public boolean isVaccinated() {
        return this.isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getType(){
        return TYPE;
    }

    @Override
    public String toString() {
        return String.format("%S{name = %s, owner = %s}", TYPE, nameAnimal, ownerName);
    }

}