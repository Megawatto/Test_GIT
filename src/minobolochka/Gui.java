package minobolochka;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Gui extends Frame {

    Board board = new Board();

    Gui() {
        setLayout(null);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(350, 330);
        setVisible(true);
        add(board);

    }
}

class Board extends Panel {

    Point[] points;
    Point[] points2;
    int key;

    public Board() {
        setBackground(Color.lightGray);
        setSize(220, 220);
        setLocation(50, 50);
    }

    void setPoint(Point[] points,Point[] points2) {
        this.points = points;
        this.points2 = points2;
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
            virst(g);
            last(g);       
    }

    Graphics virst(Graphics g) {
        for (Point point : points) {
            try {
                g.fillOval(point.x, point.y, 5, 5);
            } catch (Exception e) {
                System.err.println("except GUI");
            }
        }
        return g;
    }

    Graphics last(Graphics g) {
        try {
            for (int i = 0; i < points2.length; i++) {
                g.drawLine(points2[i].x, points2[i].y, points2[i+1].x, points2[i+1].y);            
            }
        } catch (Exception e) {
            System.err.println("qqqq");
        }
        return g;
    }
}
