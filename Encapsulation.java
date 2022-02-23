class A{
    
  private int id;
  private String name;
  public void set(int id,String name)
{
  this.id =id;
  this.name  = name; 
}

public int get()
{
   return this.id;
}

public String toString()
{
  return "Informaton is "+this.get()+" "+name;
}
 
}


public class Encapsulation {

    
    public static void main(String args[]) {
     
         A  ob = new A();
         ob.set(12,"ABUL");
        System.out.println(ob.toString());

    }
}
