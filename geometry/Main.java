package geometry;
public class Main {
    public static void main(String[] args) {
        Point center = new Point (3.0, 4.0);

        Circle circle = new Circle(center, 5.0); 

        System.out.println("Współrzędne środka koła: (" + circle.getCenter().getX() +", " + circle.getCenter().getY() + ") \n");
        System.out.println("Promień koła: " + circle.getRadius() + "\n");
        System.out.println("Obwód koła: " + circle.calculatePerimeter() + "\n");
        System.out.println("Pole powierzchni koła: " + circle.getArea() + "\n"); 
    }
}