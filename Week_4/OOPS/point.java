class point {
    private int x,y;
    public point(){
        this.x = 0;
        this.y = 0;
        System.out.println("Default constructor called. Point is at origin (0,0)");
    }
    public point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor called. Point is at (" + x + ", " + y + ")");
    }
    public void setX(int x){
        this.x = x;
        System.out.println("X-coordinate updated to " + x);
    }
    public void setY(int y){
        this.y = y;
        System.out.println("Y-coordinate updated to " + y);
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Both coordinates updated to (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        point p1 = new point();
        point p2 = new point(5, 10);
        p1.setX(10);
        p1.setY(20);
        p1.setXY(15, 25);
    }
}
