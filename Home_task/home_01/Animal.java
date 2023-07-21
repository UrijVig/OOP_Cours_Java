package Home_task.home_01;

public class Animal {
    protected String animalName;
    protected String ownersName;
    protected String diagnose;
    protected Boolean isVaccinated;
    protected String habitat;
    protected final String TYPE = getClass().getSimpleName();
    protected void toGo(){
        if (!habitat.equals("water"))
        System.out.printf("%s running! \n", TYPE);
        else System.out.printf("%s can't run! \n", TYPE);
    }
    protected void toFly(){
        if (habitat.equals("sky"))
        System.out.printf("%s flying! \n", TYPE);
        else System.out.printf("%s can't fly! \n", TYPE);
    }
    protected void toSwim(){
        if (!habitat.equals("sky"))
        System.out.printf("%s swimming! \n", TYPE);
        else System.out.printf("%s can't swim! \n", TYPE);
    }

    public Animal(String animalName, String ownersName, String diagnose, Boolean isVaccinated,String habitat) {
        this.animalName = animalName;
        this.ownersName = ownersName;
        this.diagnose = diagnose;
        this.isVaccinated = isVaccinated;
        this.habitat = habitat;
    }

    public Animal(String animalName, String habitat) {
        this(animalName, null, null, false, habitat);
    }

    public Animal() {
        this(null, "earth");
    }

    @Override
    public String toString() {
        return String.format("%s{name: %s, owner: %s}", TYPE, animalName, ownersName);
    }

    public String getAnimalName() {
        return animalName;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    public String getType() {
        return TYPE;
    }
}