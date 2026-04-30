public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 5.0);
        Rectangle rectangle = new Rectangle("Прямоугольник", 4.0, 6.0);
        Triangle triangle = new Triangle("Треугольник", 3.0, 4.0, 5.0);

        Shape[] shapes = {circle, rectangle, triangle};

        System.out.println("Информация о фигурах");
        for (Shape shape : shapes) {
            System.out.println(shape.getInfo());
        }

        System.out.println("\nОбщая площадь");
        double totalArea = ShapeUtils.getTotalArea(shapes);
        System.out.printf("Общая площадь всех фигур: %.2f\n", totalArea);

        System.out.println("\nФигура с максимальной площадью");
        Shape maxShape = ShapeUtils.getShapeWithMaxArea(shapes);
        System.out.println("Фигура с максимальной площадью: " + maxShape.getInfo());
    }
} 