 class Super{
     int height,wide;

    Super(int height){
     this.height = height;
  }
     
     public void fun(){
        System.out.println(this.height);
       }

}

class A extends Super{
        
     int x;
     
  A(int x){
  super(x);
   this.x = x;
  
}
      
  public void call(){
  System.out.println("A Claas");
 
 }
}

class base extends A{
       
         int a,b,c;
       base(int a,int b,int c){
       super(c);
      this.a = a;
      this.b = b;
       
}
      
  void Display(){
    
   System.out.println(this.a+" "+this.b);

  }

}

public class Inheritance {

    public static void main(String args[]) {
          
     base ob = new base(12,23,40);
     A obj = new A(12);
     obj.call();
     ob.call();
     ob.Display();
     ob.fun();

    }
}
