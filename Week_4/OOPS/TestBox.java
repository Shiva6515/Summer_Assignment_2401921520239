class Box{
    protected double length;
    protected double breadth;
    public Box(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length * breadth;
    }
    public void display(){
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + area());
    }
}

class Box3D extends Box{
    private double height;
    public Box3D(double length, double breadth, double height){
        super(length, breadth);
        this.height = height;
    }
    public double volume(){
        return length * breadth * height;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume());
    }
} 

public class TestBox {
    public static void main(String[] args) {
        Box box = new Box(5.0, 3.0);
        box.display();

        Box3D box3D = new Box3D(5.0, 3.0, 2.0);
        box3D.display();
    }
}
