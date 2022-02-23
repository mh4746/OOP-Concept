
class A{
   int x = 10;
void foo(){
  System.out.println("A class");
}

}

class B extends A{

 void foo(){
  
System.out.println("B class");
  
}


}

class C extends A{
    
   void foo()
{
  System.out.println("C class");

}

}


public class polymorphism {

    
    public static void main(String args[]) {
               
 A a = new A();
  a.foo();
 // System.out.println(a.x);
 

   }
}
