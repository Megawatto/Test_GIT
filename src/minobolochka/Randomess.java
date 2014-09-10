
package minobolochka;
import java.util.Random;

public class Randomess {
    Random random = new Random();
    Point [] points = new Point[10];

    public Randomess() {
        System.out.println("Random points");
        for (int i = 0; i < points.length; i++) {
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
