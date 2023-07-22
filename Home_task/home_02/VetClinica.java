package Home_task.home_02;

import Home_task.home_02.animal.Animal;
import Home_task.home_02.animal.Flyable;
import Home_task.home_02.animal.Runnable;
import Home_task.home_02.animal.Swimable;
import Home_task.home_02.human.Human;

import java.util.ArrayList;
import java.util.List;

public class VetClinica {
    private final  List<Animal> patient;
    private final List<Human> personal;

    public VetClinica() {
        this.patient = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public VetClinica addNewAnimal(Animal animal){
        patient.add(animal);
        return this;
    }

    public VetClinica addNewPerson(Human human){
        personal.add(human);
        return this;
    }

    public List<Animal> getPatient() {
        return patient;
    }

    public List<Animal> getRunningAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: patient) {
            if (animal instanceof Runnable){
                result.add(animal);
            }
        }
        return result;
    }
    public List<Animal> getSwimmingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: patient) {
            if (animal instanceof Swimable){
                result.add(animal);
            }
        }
        return result;
    }
    public List<Animal> getFlyingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: patient) {
            if (animal instanceof Flyable){
                result.add(animal);
            }
        }
        return result;
    }

//    public List<Flyable> getFlyingAnimals(){
//        List<Flyable> result = new ArrayList<>();
//        for (Animal animal: patient) {
//            if (animal instanceof Flyable){
//                result.add((Flyable) animal);
//            }
//        }
//        return result;
//    }
}
