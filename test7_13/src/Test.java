/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: yaoyao2024
 * Date: 2023-07-13
 * Time: 20:52
 */
abstract class Shape {
    abstract public void draw();
    protected double area;

    public double getArea() {
        return area;
    }
}


//矩形类
class Rect extends Shape {
    private final double length;
    private final double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("矩形：length = " + length + "width = " + width);
    }

    @Override
    public double getArea() {
        return area = length * width;
    }
}

//圆形类
class Circle extends Shape {
    private final double r;
    final private double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("圆形：半径r = " + r);
    }

    @Override
    public double getArea() {
        return  area = PI * r * r;
    }
}

public class Test {
}
