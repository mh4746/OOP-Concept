 
interface A
{
    public void print_geeks();
}

interface B
{
  public void print_for();

}

interface C
{
  public void print_C();

}

interface child extends A,B,C{
   public void print_child();
}

class derivied implements child{
      public void print_geeks()
      {
      System.out.println("A interface");
      }

    public void print_for(){
    System.out.println("B interface");    
    }

   public void print_C()
  {
  System.out.println("C interface");
  }

public void print_child(){
  System.out.println("child interface");
}
 
}

public class Interfaces {

     
    public static void main(String args[]) {
             
    derivied d = new derivied();
   
    d.print_geeks();
    d.print_for();
   d.print_C();
   d.print_child();

    
    }
}
