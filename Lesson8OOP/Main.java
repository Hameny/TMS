package by.tms.OOP.HW.Lesson8OOP;

public class Main {

    public static void main(String[] args) {
        Figure circle = new Circle("Circle", new Point(2, 0));
        Figure rectangle = new Rechtangle("Rechtangle ", new Side(4), new Side(6));
        Figure triangle = new Triangle("Triangle", new Side(6), new Side(6), new Side(6));
        Figure square = new Square("Square", new Side(4));
        Figure parallelogram = new Parallelogram("Parallelogram", new Side(6), new Side(6), 30);
        getResult(circle, rectangle, triangle, parallelogram, square);
    }

    public static void getResult(Figure... figures) {
        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.printf("Area " + figure.getName() + " = %.2f\n" , figure.countArea());
            System.out.printf("Perimeter " + figure.getName() + " = %.2f\n" , figure.countPerimeter());

            if (figure instanceof Circle) {
                System.out.printf("Diameter = %.2f\n" , ((Circle) figure).countDiameter());
                System.out.printf("Radius = %.2f\n" , ((Circle) figure).countRadius());
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Parallelogram) {
                System.out.printf("Diagonal = %.2f\n", ((Parallelogram) figure).countDiagonal());
                System.out.printf("Height = %.2f\n", ((Parallelogram) figure).countHeight());
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Rechtangle) {
                System.out.printf("Diagonal = %.2f\n", ((Rechtangle) figure).countDiagonal());
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Square) {
                System.out.printf("Diagonal = %.2f\n", ((Square) figure).countDiagonal());
                ShapeUtils.toPrint(figure);
            } else if (figure instanceof Triangle) {
                System.out.printf("Height = %.2f\n", ((Triangle) figure).countHeight());
                ShapeUtils.toPrint(figure);
            }
            System.out.println();
        }
    }
}
