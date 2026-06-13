// Problem Name : Playable Interface - Package Demo
// Topic        : Interface + Packages
// Language     : Java
 
package live;
 
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
 
public class Test {
 
    public static void main(String[] args) {
 
        // a. Create an instance of Veena and call play()
        Veena veena = new Veena();
        veena.play();
 
        // b. Create an instance of Saxophone and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();
 
        // c. Place instances in a variable of type Playable and call play()
        Playable instrument1 = veena;
        instrument1.play();
 
        Playable instrument2 = saxophone;
        instrument2.play();
    }
}
