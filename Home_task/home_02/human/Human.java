package Home_task.home_02.human;

public abstract class Human {
    protected String name;
    protected final String TYPE = getClass().getSimpleName();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return TYPE;
    }
}
