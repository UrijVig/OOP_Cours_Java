package Home_task.home_03;
import Seminar_task.Seminar01_02_03.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy dog = new Pharmacy();
        Pharmacy dog1 = new Pharmacy();
        Pharmacy dog2 = new Pharmacy();
        Pharmacy cat = new Pharmacy();
        Pharmacy dag = new Pharmacy();
        Pharmacy cat1 = new Pharmacy();

        dog.addComponent(new Component("Peneciline", "0.6", 15)).addComponent(new Component("Water", "1.2", 4));
        dog1.addComponent(new Component("Peneciline", "0.6", 15)).addComponent(new Component("Water", "1.2", 4));
        dog2.addComponent(new Component("Peneciline", "1.6", 25)).addComponent(new Component("Water", "1.2", 4));
        cat.addComponent(new Component("Ibuprofen", "0.6", 15)).addComponent(new Component("Milk", "1.2", 4));
        cat1.addComponent(new Component("Peneciline", "0.6", 15)).addComponent(new Component("Water", "1.2", 4));
        dag.addComponent(new Component("Paracetamol", "0.6", 8)).addComponent(new Component("wain", "1.2", 4));

        List<Pharmacy> pharm = new ArrayList<>();
        pharm.add(dog);
        pharm.add(dog1);
        pharm.add(dog2);
        pharm.add(cat);
        pharm.add(cat1);
        pharm.add(dag);

        for (Pharmacy ex : pharm) {
            System.out.println(ex);
        }
        System.out.println(pharm.size());
        System.out.println("_______________________________________________________________________________________");

        Collections.sort(pharm);
        for (Pharmacy ex : pharm) {
            System.out.println(ex);
        }
        System.out.println("_______________________________________________________________________________________");

        Set<Pharmacy> result = new HashSet<>(pharm);
        System.out.println(result.size());
        for (Pharmacy ex : result) {
            System.out.println(ex);
        }


    }
}
