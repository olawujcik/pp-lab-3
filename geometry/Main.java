package geometry;
public class Main {
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(4.0, 5.0);
 
        System.out.println("Pole: " + rectangle.calculateArea() + "\n");
        System.out.println("Obwod: " + rectangle.calculatePerimeter() + "\n");
        
     }
}