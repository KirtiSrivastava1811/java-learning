 class calculator
 {
    int num;

    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    
}

public class demo26 {
    public static void main(String[] args) {
        int data = 10;
        calculator obj=new calculator();
        int r1 = obj.add(n1:3,n2:4);
        System.out.println(r1);
    }
}
