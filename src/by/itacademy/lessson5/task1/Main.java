package by.itacademy.lessson5.task1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(3);
        Triangle triangle = new Triangle(3, 2);

        System.out.println(circle.calculationArea());
        System.out.println(rectangle.calculationArea());
        System.out.println(square.calculationArea());
        System.out.println(triangle.calculationArea());

    }
}
