package minobolochka;

import java.util.ArrayList;

public class MinObolochka {

    public static void main(String[] args) {
//      Gui g1 = new Gui();
//      g1.board.setPoint(new Randome().getPoints());
        Point[] p = new Randome().getPoints();
        Logic l = new Logic();
        l.solve(p);
        Gui g1 = new Gui();
        g1.board.setPoint(p, l.points2);
//        Gui g2 = new Gui();
//        g2.board.setPoint(l.points2, 1);
        System.out.println("__________");

        try {
            for (int i = 0; i < l.points2.length; i++) {
                System.out.println("x=" + l.points2[i].x + "\ty=" + l.points2[i].y + "\tid=" + l.points2[i].idPoint);
            }
        } catch (Exception e) {
            System.err.println("except MAIN");
        }
    }

}
