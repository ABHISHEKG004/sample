package JavaConcepts.ShallowVsDeepCopy.ShallowCopy;

/**
 * Created by abhishek.gupt on 11/02/18.
 */
class Student implements Cloneable
{
    int id;

    String name;

    Course course;

    public Student(int id, String name, Course course)
    {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Default version of clone() method. It creates shallow copy of an object.

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}