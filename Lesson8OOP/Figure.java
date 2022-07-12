package by.tms.OOP.HW.Lesson8OOP;

public abstract class Figure implements AreaCalculation,PerimetrCalculation {

    private final String nameFigure;

    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public boolean isAreaEqual(Figure figure) {
        return this.countArea() == figure.countArea();
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + nameFigure + '\'' +
                '}';
    }

    public String getName() {
        return nameFigure;
    }
}