
package addition;

/**
 *
 * @author #Gwatso
 */
import java.util.Scanner;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter two integers to calculate their sum: ");
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        y = in.nextInt();
        z=x+y;
        System.out.println("Sum of integers: "+z);
        
    }
}
