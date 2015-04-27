package puzzler02;

class StringCounter extends Counter
{
    private final String _string;

    public StringCounter(String string)
    {
        super(0);
        _string = string;
    }

    public String toString()
    {
        return "< " + _string.toUpperCase() + ":" + getValue() + " >";
    }
}
