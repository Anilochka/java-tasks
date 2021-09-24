package ru.mail.polis.homework.simple;

/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class DoubleAdvancedTask {

    /**
     * Вывести три корня кубического уравнения через запятую: a * x ^ 3 + b * x ^ 2 + c * x + d = 0;
     * Вывод менять не нужно, надо только посчитать x1, x2 и x3, где x1 >= x2 >= x3
     * Считаем, что все три корня вещественные.
     * <p>
     * Если используете какой-то конкретный способ, напишите какой.
     * Пример: (1, -4, -7, 10) -> "-2.0, 1.0, 5.0"
     */
    public static String equation(int a, int b, int c, int d) {
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;

        if (a == 0) {
            if (b == 0) {
                return String.valueOf(-(double) d / c);
            }

            double D = c * c - 4 * b * d;
            return (D >= 0) ? (((-c - Math.sqrt(D)) / (2 * b)) + ", " + ((-c + Math.sqrt(D)) / (2 * b))) : "";
        }

        // Решение по теореме Виета-Кардана при a = 1
        double doubleB = (double) b / a;
        double doubleC = (double) c / a;
        double doubleD = (double) d / a;
        //a = 1;

        double Q = (Math.pow(doubleB, 2) - 3 * doubleC) / 9;
        double R = (2 * Math.pow(doubleB, 3) - 9 * doubleB * doubleC + 27 * doubleD) / 54;

        double phi = (Q != 0) ? (Math.acos(R / Math.sqrt(Math.pow(Q, 3))) / 3) : 0;
        x1 = -2 * Math.sqrt(Q) * Math.cos(phi) - doubleB / 3;
        x2 = -2 * Math.sqrt(Q) * Math.cos(phi + (2 * Math.PI / 3)) - doubleB / 3;
        x3 = -2 * Math.sqrt(Q) * Math.cos(phi - (2 * Math.PI / 3)) - doubleB / 3;

        double min = Math.min(Math.min(x1, x2), x3);
        double middle = Math.min(Math.max(x1, x2), x3);

        x1 = Math.max(Math.max(x1, x2), x3);
        x2 = middle;
        x3 = min;
        return x1 + ", " + x2 + ", " + x3;
    }

    /**
     * Нужно посчитать расстояние, между двумя прямыми
     * Примеры: (1, 1, 2, -1) -> 0
     * (0, 1, 0, 5) -> 4
     */
    public static float length(double a1, double b1, double a2, double b2) {
        return 0;
    }

    /**
     * Даны три точки в пространстве (x1, y1, z1) , (x2, y2, z2) и (x3, y3, z3). Вам нужно найти Z координату
     * четвертой точки (x4, y4, z4), которая находится на той же плоскости что и первые три.
     * (0, 0, 1,
     * 1, 1, 1,
     * 10, 100, 1,
     * 235, -5) -> 1
     */
    public static double surfaceFunction(int x1, int y1, int z1,
                                         int x2, int y2, int z2,
                                         int x3, int y3, int z3,
                                         int x4, int y4) {
        return 0;
    }
}