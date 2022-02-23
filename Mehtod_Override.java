 
  class A{
    
    void foo(){
   System.out.println("A class");
 }    

}

class B extends A{
    
  void foo(){
     
  System.out.println("B class");
 

 } 

}
class C extends B{

    void foo()
   {    
        super.foo();
       System.out.println("C class");
   }
 
  }

public class Mehtod_Override {

    
    public static void main(String args[]) {
          
        C b = new C();
          b.foo(); 
        

    }
}
