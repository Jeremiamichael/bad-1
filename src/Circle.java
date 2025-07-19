public class Circle extends Shape {
    private double radius;
    
    public Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public int getSides() {
        return 0; 
    }
}
