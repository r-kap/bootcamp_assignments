package Demo.assignment2;

//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
class demo
{
    void greetings()
    {
        System.out.println("Hello world!");
    }
}

//When this code is run, it will not give or raise any exception.
//to raise such an error like <code>NoClassDefFoundError</code> we need to delete the demo.class file.
public class Q3
{
    public static void main(String[] args)
    {
        demo d = new demo();
        d.greetings();

        //ClassNotFoundException can be raised by usig Class.forName() or loadClass() methods
        //to check the output by the following code, comment the above two lines of code
        try
        {
            Class.forName("sort");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}