package by.tms.OOP.HW.Lesson8OOP;

import java.util.Objects;

public class Circle extends Figure implements CircleCalculation {

    private final Point point1;

    public Circle(String nameFigure, Point point1) {
        super(nameFigure);
        this.point1 = point1;
    }

    public double countRadius() {
        return Math.sqrt(Math.pow((point1.getX()), 2) + Math.pow(point1.getY(), 2));
    }

    @Override
    public double countDiameter() {
        return 2 * countRadius();
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow((countRadius()), 2);
    }

    @Override
    public double countPerimeter() {
        return Math.PI * countDiameter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point1=" + point1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(point1, circle.point1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1);
    }

    public Point getPoint() {
        return point1;
    }
}