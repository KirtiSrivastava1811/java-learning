

class computer
{
    public void playmusic()
    {
        System.out.println("music playing..");
    }
    public String getMeAPen(int cost)
    {
    if (cost >=10)
     return "pen";

    return"nothing";
}
}
public class demo5 {
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
    }
}
