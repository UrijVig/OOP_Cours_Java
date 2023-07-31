package Seminar_task.Seminar01_02_03;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" + "name='" + name + '\'' + ", weight='" + weight + '\'' + ", power=" + power + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component)) return false;

        Component component = (Component) o;

        if (getPower() != component.getPower()) return false;
        if (!getName().equals(component.getName())) return false;
        if (!getWeight().equals(component.getWeight())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getWeight().hashCode();
        result = 31 * result + getPower();
        return result;
    }
}
