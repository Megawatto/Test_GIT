
package minobolochka;

public class Point {
    int x;
    int y;
    int idPoint;
    static int id;

    public void pr() {
        idPoint = id++;
        System.out.println("x=" + x + "\t y=" + y + "\t id=" + idPoint);
    }
    
}
