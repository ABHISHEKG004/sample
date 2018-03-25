package JavaConcepts.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by abhishek.gupt on 25/03/18.
 */

public class ConcurrentHashMapExample extends Thread
{
    static ConcurrentHashMap<Integer,String> l =
            new ConcurrentHashMap<Integer,String>();

    public void run()
    {
        // Child add new element in the object
        l.put(103,"D");

        try
        {
            Thread.sleep(1000);

        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        l.put(100,"A");
        l.put(101,"B");
        l.put(102,"C");
        ConcurrentHashMapExample t=new ConcurrentHashMapExample();
        t.start();

        /*Note :
        Behaviour of map content is unknown in case of concurrentHashMap because when printing
        list it will show the list which was recently updated so can't predict the behaviour. In above case
        o/p can be either {100=A, 101=B, 102=C, 103=D} or {100=A, 101=B, 102=C}
        */

        System.out.println(l);

        for (Object o : l.entrySet())
        {
            Object s=o;
            //System.out.println(s);
            //Thread.sleep(1000);
        }
        System.out.println(l);
    }
}