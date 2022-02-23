 
interface A{
   default void foo()
{
   System.out.println("Default A call");
}
  
}

interface B{

}

class C implements A,B{
            

}

public class multiple_Interface {

     
    public static void main(String args[]) {
           
        C c = new C();
        c.foo();

    }
}
