
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartment = new Compartment[10];
        for (int i = 0; i < compartment.length; i++) {
            int randomNumber = (int) (Math.random() * 4) + 1;
            switch (randomNumber) {
                case 1:
                    compartment[i] = new FirstClass();
                    break;
                case 2:
                    compartment[i] = new Ladies();
                    break;
                case 3:
                    compartment[i] = new Luggage();
                    break;
                case 4:
                    compartment[i] = new General();
                    break;
            }
        }
        for(int i=0;i<compartment.length;i++){
            
            System.out.println(compartment[i].notice());
        }
    }    

}
