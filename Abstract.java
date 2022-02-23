abstract class shape{
         
     String color;
  
     abstract double area();      
     public abstract String toString();
 
     public String getColor() 
    {
      return color;
    }

}

class circle extends shape{
         
        double redius;
     @Override  double area()
     {
           return 3.1416*redius*redius;
     }
     @Override public String toString()
     {
       return "The circle color is "+super.getColor()+" and the area is "+area();
     }  
 
     }

class rect extends shape{
         
     double wide,length;
     
  @Override  double area()
   {
     return wide*length;
   }
@Override  public String toString()
   {
      return "The rectanculer color is: "+super.getColor()+" and area is "+area();
   }

}

public class Abstract {

    public static void main(String args[]) {
        
        circle obj = new circle();
         obj.redius = 10;
         obj.color = "Red";
        rect ob = new rect();
        ob.wide = 10;
        ob.length = 12;
         ob.color = "Green";
        System.out.println(obj.toString());
        System.out.println(ob.toString());

    }
}
