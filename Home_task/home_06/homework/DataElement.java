package Home_task.home_06.homework;

public abstract class DataElement{
    protected final String name;

    protected DataElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
