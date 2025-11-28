class A 
{
    public void show()
    {
        System.out.println("show of A");
    }
}
class B extends A
{
    //public void show()
    //{
      //  System.out.println("show of B");
    //}
} 
class MethodOverride
{
    public static void main(String a[])
    {
        B b=new B();
        b.show();
    }
}
