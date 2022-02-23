 class A{
   
   public void print_A(){
   System.out.println("A claas");
}

}
class B extends A{
   public void print_B(){
  System.out.println("B claas"); 
}
}

class C extends A{
public void print_C()
{
  System.out.println("C class");
}   

}

class D extends A{
  
public void print_D()
{
  System.out.println("D class");
}   

}

public class Inheritence2 {

   
    public static void main(String args[]) {
    
     B ob = new B();
     ob.print_A();
     ob.print_B();

     C obj = new C();
     obj.print_A();
     obj.print_C();

    D d  = new D();
     d.print_A();
     d.print_D();

    }
}
