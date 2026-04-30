public class Shape {
    private String name;

    public Shape (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public String getInfo() {
        return String.format("Фигура: %s, Площадь: %.2f, Периметр: %.2f",
                name, getArea(), getPerimeter());
    }

}
