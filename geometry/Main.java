package geometry;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(new Point(3.0, 5.0), 6.0);
        circles[1] = new ColoredCircle(new Point (3.0, 9.0 ), 6, "yellow");
        circles[2] = new ColoredCircle(new Point (8.0, 1.0 ), 2, "black"); 


        for (Circle circle : circles){
            double area = circle.getArea();
            System.out.println("Pole powierzchni koła: " + area + "\n");
        
        if (circle instanceof ColoredCircle){
            String color = ((ColoredCircle)circle).getColor();
            System.out.println("Kolor kola: " + color + "\n");

            }
        }
    }
}