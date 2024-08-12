import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        System.out.println("Периметр круга: " + circle.calculatePerimeter() + " см");
        System.out.println("Площадь круга: " + circle.calculateArea() + " кв см");
        System.out.println("Цвет заливки круга: " + circle.getFillColor());
        System.out.println("Цвет контура круга: " + circle.getBorderColor());

        Rectangle rectangle = new Rectangle(3, 4, "Blue", "Green");
        System.out.println("Периметр квадрата: " + rectangle.calculatePerimeter() + " см");
        System.out.println("Площадь квадрата: " + rectangle.calculateArea() + " кв см");
        System.out.println("Цвет заливки квадрата: " + rectangle.getFillColor());
        System.out.println("Цвет периметра квадрата: " + rectangle.getBorderColor());

        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter() + " см");
        System.out.println("Площадь треугольника: " + triangle.calculateArea() + " кв см");
        System.out.println("Цвет заливки треугольника: " + triangle.getFillColor());
        System.out.println("Цвет контура треугольника: " + triangle.getBorderColor());
    }

}






