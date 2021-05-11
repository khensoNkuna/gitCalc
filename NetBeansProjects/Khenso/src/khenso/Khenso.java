
package khenso;

import java.util.Scanner;

/**
 *
 * @author 201868164
 */
public class Khenso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      int a, b, res;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Two Numbers : ");
       a = scan.nextInt();
       b = scan.nextInt();
	   
       res = a + b;
       System.out.println("Addition = " +res);
	   
       res = a - b;
       System.out.println("Subtraction = " +res);
	   
       res = a * b;
       System.out.println("Multiplication = " +res);
	   
       res = a / b;
       System.out.println("Division = " +res);
    }
}
    
    

