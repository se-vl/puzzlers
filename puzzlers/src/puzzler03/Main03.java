package puzzler03;

import java.util.Arrays;

public class Main03
{
    public static void main(String[] args)
    {
        InstrumentedHashSet<String> names = new InstrumentedHashSet<String>();
        names.addAll(Arrays.asList("Alice", "Bob", "Carol", "Dave"));
        names.add("Eve");
        names.add("Mallory");
        System.out.println("counted " + names.getCounter() + " insertions");
    }
}
