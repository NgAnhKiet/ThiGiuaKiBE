//Bài 1:
public abstract class Shape {
    public String color;
    public double borderWidth;

    public Shape(String color, double borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Đỏ", 2, 5, 8);
        Circle circle = new Circle("Vàng", 1, 4);
        Triangle triangle = new Triangle("Xanh", 3, 3, 4, 5);

        displayShapeInfo(rectangle);
        displayShapeInfo(circle);
        displayShapeInfo(triangle);
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Hình: " + shape.getClass().getSimpleName());
        System.out.println("Màu sắc: " + shape.color);
        System.out.println("Độ dày viền: " + shape.borderWidth);
        System.out.println("Diện tích: " + shape.calculateArea());
        System.out.println("Chu vi: " + shape.calculatePerimeter());
        System.out.println("-----------------------");
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (String color, double borderWidth, double width, double height) {
        super(color, borderWidth);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, int borderWidth, double side1, double side2, double side3) {
        super(color, borderWidth);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
