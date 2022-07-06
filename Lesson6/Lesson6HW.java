package tms.java.lesson6OOP;

public class Lesson6HW {
    public static void main(String[] args) {

        Point pointOne = new Point(2, 5);
        Point pointTwo = new Point(7, 2);
        System.out.println("Point one(" + pointOne.coordinateX + ", " + pointOne.coordinateY + ")");
        System.out.println("Point two(" + pointTwo.coordinateX + ", " + pointTwo.coordinateY + ")");
        System.out.printf("Distance = %.2f\n", pointOne.getDistance(pointTwo));


        Rectangle rectangle = new Rectangle(pointOne, pointTwo);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimetr = " + rectangle.getPerimetr());
        System.out.printf("Length diagonal = %.2f\n", rectangle.getDiagonal());
    }

}
