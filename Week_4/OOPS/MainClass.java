class outer{
    void display(){
        System.out.println("This is outer class");
    }
    class inner{
        void display(){
            System.out.println("This is inner class");
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.display();

        outer.inner in = obj.new inner();
        in.display();
    }
}
