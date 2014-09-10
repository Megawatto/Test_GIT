package minobolochka;

public class Logic {

    Point[] points = new Point[10];
    Point[] points2 = new Point[11];

    int vect(Point a1, Point a2, Point b1, Point b2) {
        return ((a2.x - a1.x) * (b2.y - b1.y) - (b2.x - b1.x) * (a2.y - a1.y));
    }

    int dist2(Point a1, Point a2) {
        return (int) (Math.pow((a2.x - a1.x), 2) + Math.pow((a2.y - a1.y), 2));
    }

    Point[] solve(Point[] p) {
        this.points = p;
        int m = 0;
        for (int i = 1; i < Point.id; i++) {
            if (points[i].y < points[m].y) {
                m = i;
            } else if (points[i].y == points[m].y && points[i].x > points[i].x) {
                m = i;
            }
        }
        points2[0] = points[m];
        points[m] = points[0];
        points[0] = points2[0];
        int k = 0;
        int min = 1;
        do {
            for (int j = 1; j < Point.id; j++) {
                if (vect(points2[k], points[min], points2[k], points[j]) < 0
                        || ((vect(points2[k], points[min], points2[k], points[j]) == 0)
                        && (dist2(points2[k], points[min]) < dist2(points2[k], points[j])))) {
                    min = j;
                }
            }
            if (k < 10) {
                k++;
            }
            points2[k] = points[min];
            min = 0;
        } while (check(k));
        return points2;
    }

    boolean check(int k) {
        if (points2[k].equals(points2[0])) {
            return false;
        }
        return true;
    }

    Point[] getPoints() {
        return points2;
    }
}
