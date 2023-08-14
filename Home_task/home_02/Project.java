package Home_task.home_02;

// Создать класс Doctor и подумать над его поведением.
// Создать класс Nurse(медсестра) и подумать над его поведением.
// Создать класс Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть
// методы получения скорости заданного действия.
// Добавьте наследников этим интерфейсам, но таким образом,
// чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
// У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих.

import Home_task.home_02.animal.*;
import Home_task.home_02.human.Doctor;
import Home_task.home_02.human.Nurse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Project {
    public static void main(String[] args) {
        VetClinica clinicaSunDay = new VetClinica();
        String[] animals = {"Пушок", "Мотыга", "Василёк", "Петрович", "Карлайл", "Мотылёк", "Зебровка", "Барсик", "Гав", "Милка", "Швепс", "Пудинг", "Редиска", "Валына", "Вилка"};
        String[] owners = {"Алиса", "Максим", "Пётр", "Василиса", "Ибрагим", "Ольга", "Александр", "Юрий", "Василий", "Андрей", "Вадим", "Оксана", "Вячеслав", "Ильдар", "Марк"};
        List<String> animalNames = new ArrayList<>(Arrays.asList(animals));
        List<String> ownersNames = new ArrayList<>(Arrays.asList(owners));

        String animalName;
        String ownerName;
        Animal animal;

        Random random = new Random();
        Doctor doctor = new Doctor("Иван Васильевич");
        Nurse nurse = new Nurse("Галина Викторовна");
        clinicaSunDay.addNewPerson(doctor);
        clinicaSunDay.addNewPerson(nurse);
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(6)) {
                case (1):
                    clinicaSunDay.addNewAnimal(new Cat());
                    break;
                case (2):
                    clinicaSunDay.addNewAnimal(new Dog());
                    break;
                case (3):
                    clinicaSunDay.addNewAnimal(new GoldFish());
                    break;
                case (4):
                    clinicaSunDay.addNewAnimal(new Owl());
                    break;
                case (5):
                    clinicaSunDay.addNewAnimal(new Parrot());
                    break;
                case (0):
                    clinicaSunDay.addNewAnimal(new Turtle());
                    break;
                default:
                    break;
            }

            animalName = animalNames.get(random.nextInt(animalNames.size()));
            ownerName = ownersNames.get(random.nextInt(ownersNames.size()));
            animal = clinicaSunDay.getPatient().get(i);

            nurse.createNewPatient(animalName, ownerName, animal);

        }
        System.out.println("Итоги регистрации: ");
        System.out.println(clinicaSunDay.getPatient());
        for (Animal temp : clinicaSunDay.getPatient()) {
            doctor.checkup(temp);
            nurse.vaccination(temp);
        }
        System.out.println("Итоги осмотра: ");
        System.out.println(clinicaSunDay.getPatient());
        for (Animal temp : clinicaSunDay.getPatient()) {
            doctor.heal(temp, nurse);
        }
        System.out.println("Итоги за день: ");
        System.out.println("Летающие: ");
        for (Animal temp : clinicaSunDay.getFlyingAnimals()) {
            System.out.println(temp);
        }
        System.out.println("Бегающие: ");
        for (Animal temp : clinicaSunDay.getRunningAnimals()) {
            System.out.println(temp);
        }
        System.out.println("Плавающие: ");
        for (Animal temp : clinicaSunDay.getSwimmingAnimals()) {
            System.out.println(temp);
        }


    }


}
