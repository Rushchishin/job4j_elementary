package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printDistance(int x1, int y1, int x2, int y2) {
        double result = Point.distance(x1, y1, x2, y2);
        System.out.printf("result (%d, %d) to (%d, %d) %f\n", x1, y1, x2, y2, result);
    }

    public static void main(String[] args) {
        Point.printDistance(0, 0, 2, 0);
        Point.printDistance(1, 5, 4, 4);
        Point.printDistance(1345, 34, 5, 2345);
    }
}
