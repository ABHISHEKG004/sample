package JavaConcepts.ConcurrentHashMap;

import java.util.Iterator;
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
        list it will show the list which was recently updated/latest snapshot so can't predict the behaviour.
        In above case o/p can be either {100=A, 101=B, 102=C, 103=D} or {100=A, 101=B, 102=C}
        */

        //System.out.println(l);

        for (Object o : l.entrySet())
        {
            Object s=o;
            //System.out.println(s);
            //Thread.sleep(1000);
            l.put(104,"ABHi");
        }
        //System.out.println(l);

        Iterator iterator = l.keySet().iterator();

       while(iterator.hasNext()){
           l.put(105,"DOBAR");

           if(iterator.next().equals(104))
            iterator.remove();

           System.out.println(iterator.next());
       }


        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(1, 1);
        Iterator i = m.entrySet().iterator();
        m.remove(1);        // remove entry from map
        System.out.println(i.next()); //still shows entry 1=1
    }
}