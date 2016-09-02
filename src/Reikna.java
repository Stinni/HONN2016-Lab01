
import java.lang.Object;

/**
 * Forritið Reikna (Reikna.java)
 * skrifar út á skjáinn fylki með 100 punktum
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 01.09.16
 */
public class Reikna extends Object
{
    static final int MAX_NR_OF_POINTS = 100;

    public static void main (String[] args)
    {
        Point[] kurfa = new Point[MAX_NR_OF_POINTS];

        for(int i = 0; i < MAX_NR_OF_POINTS; i++)
        {
            kurfa[i] = new Point(Math.sin((double)i/100), Math.cos((double)i/100));
            System.out.println(kurfa[i].skrifa());
        }
    }
}

class Point
{
    private double dx, dy;

    public Point(double dx, double dy)
    {
        this.dx = dx;
        this.dy = dy;
    }

    public double getX()
    {
        return dx;
    }

    public double getY()
    {
        return dy;
    }

    public String skrifa()
    {
        return "Hnit (" + dx + ", " + dy + ")\n";
    }
}
