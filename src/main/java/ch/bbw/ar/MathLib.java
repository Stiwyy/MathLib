package ch.bbw.ar;

// Andrin Renggli

public class MathLib {
    private MathLib() {
     }
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double rectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double trapezoidArea(double a, double b, double height) {
        return ((a + b) / 2) * height;
    }
}
