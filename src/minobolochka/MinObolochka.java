package minobolochka;


public class MinObolochka {

    public static void main(String[] args) {
        //asdfd
        //олорапра
        Point[] p = new Randome().getPoints();
        Logic l = new Logic();
        l.solve(p);
        Gui g1 = new Gui();
        g1.board.setPoint(p, l.points2);
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
