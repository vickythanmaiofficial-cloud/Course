class A 
{
    public void show()
    {
        System.out.println("A show()");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("B show()");
    }
}
class C extends B
{
    public void show()
    {
        System.out.println("C show()");
    }
}

class polymorphism
{
    public static void main(String a[])
    {
        A obja=new A();
        obja.show();

        obja=new B();
        obja.show();

        obja=new C();
        obja.show();
    }
}