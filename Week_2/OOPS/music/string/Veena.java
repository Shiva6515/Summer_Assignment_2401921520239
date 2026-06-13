// Problem Name : Playable Interface - Package Demo
// Topic        : Interface + Packages
// Language     : Java
 
package music.string;
 
import music.Playable;
 
public class Veena implements Playable {
 
    @Override
    public void play() {
        System.out.println("Playing Veena...");
    }
}
