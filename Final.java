 class Vfx
{
    public final void credit()
    {
        System.out.println("by vicky");
    }
    
    public void show()
        {
            System.out.println("show vfx");
        }
    
}
class Movie extends Vfx
{
     public void credit()
    {
        System.out.println("by ananymous");
    }
}
class Final
{
    public static void main(String a[])
    {
        Movie m=new Movie();
        m.credit();
        m.show();
    }
}