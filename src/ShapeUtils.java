public class ShapeUtils {
    public static double getTotalArea(Shape[] shapes) {
        double total = 0;
        for (int i = 0; i < shapes.length; i++) {
            total += shapes[i].getArea();
        }
        return total;
    }

    public static Shape getShapeWithMaxArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }

        Shape maxShape = shapes[0];

        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > maxShape.getArea()) {
                maxShape = shapes[i];
            }
        }

        return maxShape;
    }
}
