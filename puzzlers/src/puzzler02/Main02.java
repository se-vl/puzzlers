package puzzler02;

public class Main02
{
    public static void main(String[] args)
    {
        Counter str = new StringCounter("hello");
        str.increment();
        str.increment();
        str.increment();
        System.out.println(str);
    }
}
