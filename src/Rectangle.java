import java.util.Scanner;
public class Rectangle {
    //присвоение ширины и высоты
    private double width = -1;
    private double height = -1;

    public Rectangle() {

    }

    //
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //конструктор для площади
    public double getArea() {
        return width * height;
    }

    //конструктор для периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
