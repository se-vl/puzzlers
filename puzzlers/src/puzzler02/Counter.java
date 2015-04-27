package puzzler02;

class Counter
{
    private int _value;

    public Counter(int initialValue)
    {
        _value = initialValue;
        System.out.println("initialized " + this + " successfully.");
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
