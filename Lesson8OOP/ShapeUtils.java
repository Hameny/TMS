package by.tms.OOP.HW.Lesson8OOP;

public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rechtangle || figure instanceof Square || figure instanceof Parallelogram;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static void toPrint(Figure figure) {
        System.out.println(figure.getName() + " is rectangle - " + isRectangle(figure));
        System.out.println(figure.getName() + " is triangle - " + isTriangle(figure));
    }
}
