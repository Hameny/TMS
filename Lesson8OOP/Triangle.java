package by.tms.OOP.HW.Lesson8OOP;

import java.util.Objects;

public class Triangle extends Figure implements HeightCalculation {

    private final Side firstSide;
    private final Side secondSide;
    private final Side thirdSide;

    public Triangle(String nameFigure, Side firstSide, Side secondSide, Side thirdSide) {
        super(nameFigure);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double countArea() {
        double semiPerimeter = countSemiPerimeter();
        return (Math.sqrt(semiPerimeter * (semiPerimeter - firstSide.getValue())
                * (semiPerimeter - secondSide.getValue())* (semiPerimeter - thirdSide.getValue())));
    }

    @Override
    public double countPerimeter() {
        return firstSide.getValue() + secondSide.getValue() + thirdSide.getValue();
    }

    public double countSemiPerimeter() {
        return (firstSide.getValue() + secondSide.getValue() + thirdSide.getValue()) / 2;
    }

    @Override
    public double countHeight() {
        return 2 * countArea() / firstSide.getValue();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + firstSide +
                ", side2=" + secondSide +
                ", side3=" + thirdSide +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(firstSide, triangle.firstSide) && Objects.equals(secondSide, triangle.secondSide) && Objects.equals(thirdSide, triangle.thirdSide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }

    public Side getSide() {
        return firstSide;
    }

    public Side getSecondSide() {
        return secondSide;
    }

    public Side getThirdSide() {
        return thirdSide;
    }
}

