package tms.java.lesson6OOP;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getDistance(Point point) {
        int dx = this.coordinateX - point.coordinateX;
        int dy = this.coordinateY - point.coordinateY;
        return Math.sqrt(dx * dx + dy * dy);
    }
}


