class A extends Thread
{
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            System.out.println("Task1 ");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=100;j++)
        {
            System.out.println("Task 2");
        }
    }
}

class Threads
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}