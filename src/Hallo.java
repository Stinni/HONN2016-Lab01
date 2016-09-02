
import java.lang.Object;

/**
 * Forritið Hallo (Hallo.java)
 * skrifar heilræði á skjáinn
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 24.08.16
 */

public class Hallo extends Object
{
    public static void main (String[] args)
    {
        /*String heilraedi = "Gott er þeim sem glatt hafa sinni,\n" +
                "guð sé með oss öllum hér inni.\n";*/

        // Skrifa á skjá
        //System.out.println (heilraedi);
        for (int i=0; i < args.length; i++)
        {
            System.out.println (args[i]);
        }
    }
}
