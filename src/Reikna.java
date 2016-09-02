/**
 * Created by KristinnHeiðar on 2.9.2016.
 */
public class Reikna extends Object
{
    public static void main (String[] args)
    {
        Point p = new Point(4.0, 3.0);
        String hnit = p.skrifa();
        System.out.println(hnit);
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
