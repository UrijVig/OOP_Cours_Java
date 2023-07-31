package Seminar_task.Seminar01_02_03;

import java.util.ArrayList;
import java.util.List;

public class VetClinica {
    private final  List<Animal> pacient;

    public VetClinica() {
        this.pacient = new ArrayList<>();
    }

    public VetClinica addNewAnimal(Animal animal){
        pacient.add(animal);
        return this;
    }

    public List<Animal> getPacient() {
        return pacient;
    }

    public List<Animal> getFlyingAnimals(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: pacient) {
            if (animal instanceof Flyable){
                result.add(animal);
            }
        }
        return result;
    }

//    public List<Flyable> getFlyingAnimals(){
//        List<Flyable> result = new ArrayList<>();
//        for (Animal animal: pacient) {
//            if (animal instanceof Flyable){
//                result.add((Flyable) animal);
//            }
//        }
//        return result;
//    }
}
