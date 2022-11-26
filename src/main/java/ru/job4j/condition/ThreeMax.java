package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        }
        if (second >= first && second >= third) {
            return second;
        }
        return third;
    }
}
