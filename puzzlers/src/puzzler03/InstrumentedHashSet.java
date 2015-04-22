package puzzler03;

import java.util.Collection;
import java.util.HashSet;

class InstrumentedHashSet<T> extends HashSet<T>
{
    private int _counter;

    public boolean addAll(Collection<? extends T> objects)
    {
        _counter += objects.size();
        return super.addAll(objects);
    }

    public boolean add(T x)
    {
        ++_counter;
        return super.add(x);
    }

    public int getCounter()
    {
        return _counter;
    }

    private static final long serialVersionUID = 3389231824587221236L;
}
