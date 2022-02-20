
import java.util.Scanner; 

public class object {

    
    public static void main(String args[]) {
     
      calculate ob = new calculate();
       
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter a");
     int a = sc.nextInt();
     System.out.println("Enter b");
     int b = sc.nextInt();
     ob.add(a,b);
 
    }
}
