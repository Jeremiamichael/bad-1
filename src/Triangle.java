public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public int getSides() {
        return 3;
    }
}
