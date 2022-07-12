package by.tms.OOP.HW.Lesson8OOP;

public class Square extends Figure implements DiagonalCalculation {

    private final Side oneSide;

    public Square(String nameFigure, Side oneSide) {
        super(nameFigure);
        this.oneSide = oneSide;
    }

    @Override
    public double countArea() {
        return Math.pow(oneSide.getValue(), 2);
    }

    @Override
    public double countPerimeter() {
        return oneSide.getValue() * 4;
    }

    @Override
    public double countDiagonal() {
        return Math.sqrt(2) * oneSide.getValue();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + oneSide +
                "} " + super.toString();
    }

    public Side getSide() {
        return oneSide;
    }
}