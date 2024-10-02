
import java.util.jar.Attributes;
import javax.naming.Name;

 class Human
 {
    private int age;
    private  String name;
    public int getAge() 
    {
    return age;
    }
    public void setAge(int a){
       this.age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n)
    {
       this. name = n;
    }
}
    
    public class demo43 {
     public static void main(String[] args) {
         System.out.println(obj .getName() + " : " + obj.getAge()  );
        obj.setAge(30);
         obj.setName(Name: "kirti")
     }
}
