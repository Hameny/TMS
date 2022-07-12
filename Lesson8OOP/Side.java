package by.tms.OOP.HW.Lesson8OOP;

public class Side {

    private final double value;

    public Side(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Side{" +
                "value=" + value +
                '}';
    }

    public double getValue() {
        return value;
    }
}
