public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("Jeremia", 5.0);
        shapes[1] = new Triangle("Johanes", 4.0, 3.0);
        shapes[2] = new Circle("Michael", 2.5);
        
        for (Shape shape : shapes) {
            System.out.println("Owner: " + shape.getOwner());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Sides: " + shape.getSides());
            System.out.println("----------------------");
        }
    }
}