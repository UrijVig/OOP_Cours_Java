package Seminar_task.Seminar01_02_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    private Pharmacy pharmacy;
    private int index = 0;

    public ComponentIterator(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return  index < pharmacy.getComponents().size();
    }

    @Override
    public Component next() {
//        Component component = components.get(index);
//        index++;
//        return component;
        return pharmacy.getComponents().get(index++);
    }
}
