package minobolochka;

/* 
* Валерий Сачков
* megawatto@mail.ru
*  Randomess - класс, который генерит случайные точки на плоскости (10 штук)
*  Logic - класс реализующий логику обертки
*  Gui - класс реализует графический вывод результатов
*  Point - класс точки, содержит координаты и порядковый номер
*/
public class MinObolochka {

    public static void main(String[] args) {
        Point[] points = new Randomess().getPoints();
        Logic logic = new Logic();
        logic.solve(points);
        Gui gui = new Gui();
        gui.board.setPoint(points, logic.getPoints());

        System.out.println("____________________");
        System.out.println("Output");

        try {
            for (Point points2 : logic.getPoints()) {
                if (points2 == null) {
                    break;
                }
                System.out.println("x=" + points2.x + "\ty=" + points2.y + "\tid=" + points2.idPoint);
            }
        } catch (Exception e) {
            System.err.println("except MAIN");
        }
    }

}
