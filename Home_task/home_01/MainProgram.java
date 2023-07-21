package Home_task.home_01;

import java.util.ArrayList;
import java.util.List;

/*
Добавить в класс Animal protected методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
наследника Animal, умеющих летать, плавать, бегать. Причем, если допустим кошка не умеет летать, то она не должна этого делать.

ОБЯЗАТЕЛЬНО: В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
(если они есть)
 */
public class MainProgram {
    public static void main(String[] args) {
        List<Animal> anList = new ArrayList<>();
        Cat cat = new Cat("Mark","earth");
        Dog dog = new Dog("Dogger","earth");
        Eagle eagle = new Eagle("Golberd","sky");
        Rooster rooster = new Rooster("Masiania","sky");
        Perch perch = new Perch("Twen","water");
        Pike pike = new Pike("Took","water");
        anList.add(cat);
        anList.add(dog);
        anList.add(eagle);
        anList.add(rooster);
        anList.add(pike);
        anList.add(perch);
        System.out.println(anList);
        for (Animal item: anList) {
            item.toFly();
            item.toGo();
            item.toSwim();
        }
    }
}