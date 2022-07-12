package by.tms.OOP.HW.Lesson8OOP;

import java.util.Objects;

public class Parallelogram extends Figure implements DiagonalCalculation, HeightCalculation {

    private final Side firstSide;
    private final Side secondSide;
    private final double angle;

    public Parallelogram(String nameFigure, Side firstSide, Side secondSide, double angle) {
        super(nameFigure);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = Math.toRadians(angle);
    }

    @Override
    public double countArea() {
        return firstSide.getValue() * secondSide.getValue() * Math.sin(angle);
    }

    @Override
    public double countPerimeter() {
        return 2 * firstSide.getValue() + 2 * secondSide.getValue();
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(Math.pow(firstSide.getValue(), 2)
                + Math.pow(secondSide.getValue(), 2)
                - 2 * firstSide.getValue()
                * secondSide.getValue()
                * Math.cos(angle));
    }

    @Override
    public double countHeight() {
        return firstSide.getValue() * Math.sin(angle);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "side1=" + firstSide +
                ", side2=" + secondSide +
                ", angle=" + angle +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.angle, angle) == 0 && Objects.equals(firstSide, that.firstSide) && Objects.equals(secondSide, that.secondSide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, angle);
    }

    public Side getSide1() {
        return firstSide;
    }

    public Side getSide2() {
        return secondSide;
    }

    public double getAngle() {
        return angle;
    }
}
