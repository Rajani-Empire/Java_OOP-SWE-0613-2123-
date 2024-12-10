//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Area of Triangle: " + TriangleArea.calculate(10, 5));
        System.out.println("Volume of Ball: " + BallVolume.calculate(3));
        System.out.println("Area of Circle: " + CircleArea.calculate(4));
        System.out.println("Celsius to Fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(25));
        System.out.println("Area of Equilateral Triangle: " + EquilateralTriangleArea.calculate(6));
        System.out.println("Area of Triangle (Heron's Formula): " + HeronTriangleArea.calculate(5, 6, 7));
    }
}


// Class to calculate the area of a triangle
class TriangleArea {
    public static double calculate(double base, double height) {
        return 0.5 * base * height;
    }
}

// Class to calculate the volume of a ball
class BallVolume {
    public static double calculate(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Class to calculate the area of a circle
class CircleArea {
    public static double calculate(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Class to convert Celsius to Fahrenheit
class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

// Class to calculate the area of an equilateral triangle
class EquilateralTriangleArea {
    public static double calculate(double side) {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}

// Class to calculate the area of a triangle using Heron's formula
class HeronTriangleArea {
    public static double calculate(double a, double b, double c) {
        double s = (a + b + c) / 2; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}