
package minobolochka;
import java.util.Random;

public class Randome {
    Random random = new Random();
    Point [] points = new Point[10];

    public Randome() {
        for (int i = 0; i < 10; i++) {
           points[i] = new Point();
           points[i].x = random.nextInt(200);
           points[i].y = random.nextInt(200); 
           points[i].pr();
        }
    }
    
    Point[]  getPoints(){
    return points;
    }
}
