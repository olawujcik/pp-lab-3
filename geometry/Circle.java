package geometry;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;

    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }

    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }


}