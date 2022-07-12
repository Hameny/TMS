package by.tms.OOP.HW.Lesson8OOP;

import java.util.Objects;

public class Rechtangle extends Figure implements DiagonalCalculation {

    private final Side firstSide;
    private final Side secondSide;

    public Rechtangle(String name, Side firstSide, Side secondSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double countArea() {
        return firstSide.getValue() * secondSide.getValue();
    }

    @Override
    public double countPerimeter() {
        return 2 * firstSide.getValue() + 2 * secondSide.getValue();
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(Math.pow(firstSide.getValue(), 2) + Math.pow(secondSide.getValue(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rechtangle that = (Rechtangle) o;
        return Objects.equals(firstSide, that.firstSide) && Objects.equals(secondSide, that.secondSide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + firstSide +
                ", side2=" + secondSide +
                "} " + super.toString();

    }

    public Side getSide1() {
        return firstSide;
    }

    public Side getSide2() {
        return secondSide;
    }
}
