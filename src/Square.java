public class Square extends Shape {
    private double side;
    
    public Square(String owner, double side) {
        super(owner);
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public int getSides() {
        return 4;
    }
}
