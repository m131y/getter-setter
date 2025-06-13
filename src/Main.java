class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return radius*radius*Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width*height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4,5);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}