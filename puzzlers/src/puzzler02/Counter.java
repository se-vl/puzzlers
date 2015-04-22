package puzzler02;

class Counter
{
    private int _value;

    public Counter(int initialValue)
    {
        _value = initialValue;
    }

    public void increment()
    {
        ++_value;
    }

    public int getValue()
    {
        return _value;
    }

    public String toString()
    {
        return "< " + _value + " >";
    }
}
