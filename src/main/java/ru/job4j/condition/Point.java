package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("result (%d, %d) to (%d, %d) %f\n", x1, y1, x2, y2, rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);

        result = Point.distance(1, 5, 4, 4);

        result = Point.distance(1345, 34, 5, 2345);
    }
}
