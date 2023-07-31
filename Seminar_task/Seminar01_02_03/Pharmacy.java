package Seminar_task.Seminar01_02_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
//    private int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
//        this.index = 0;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    private int getPharmacyPower() {
        return components.stream().mapToInt(Component::getPower).sum();

    }

    @Override
    public String toString() {
        return "Pharmacy{" + "components=" + components + '}';
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.getPharmacyPower() > o.getPharmacyPower()) return 1;
        else if (this.getPharmacyPower() < o.getPharmacyPower()) return -1;
        else if (this.components.size() > o.components.size()) return 1;
        else if (this.components.size() < o.components.size()) return -1;
        else {
            for (int i = 0; i < components.size(); i++) {
                if (this.components.get(i).getName().length() > o.components.get(i).getName().length()) return 1;
                if (this.components.get(i).getName().length() < o.components.get(i).getName().length()) return -1;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pharmacy)) return false;

        Pharmacy that = (Pharmacy) o;

        if (!getComponents().equals(that.getComponents())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getComponents().hashCode();
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return  new Iterator<Component>() {
//            @Override
//            public boolean hasNext() {
//                return  index < components.size();
//            }
//
//            @Override
//            public Component next() {
////        Component component   = components.get(index);
////        index++;
////        return component;
//                return components.get(index++);
//            }
//        };
//    }
}
