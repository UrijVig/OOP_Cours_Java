package Home_task.home_02.human;

import Home_task.home_02.animal.Animal;

import java.util.Scanner;

public class Nurse extends Human {

    private Boolean employment;
    public Nurse(String name) {
        super(name);
        this.employment = false;
    }
    public void createNewPatient(Scanner iScaner, Animal animal){
        System.out.println("Как зовут питомца? ");
        animal.setAnimalName(iScaner.nextLine());
        System.out.println("Как зовут хозяина? ");
        animal.setOwnersName(iScaner.nextLine());
    }
    public void createNewPatient(String animalName, String ownersName, Animal animal){
        animal.setAnimalName(animalName);
        animal.setOwnersName(ownersName);
    }
    public void vaccination(Animal animal){
        if (!animal.getVaccinated()){
            animal.setVaccinated(true);
        } else {
            System.out.println("Вакцина не требуется! ");
        }
    }
    public void helpTheDoctor(Doctor doctor){
        if(doctor.isNeedHelp()){
            doctor.setNeedHelp(false);
        }
    }

    public Boolean getEmployment() {
        return employment;
    }

    public void setEmployment(Boolean employment) {
        this.employment = employment;
    }
}
