#include <iostream>
#include <memory>

class Base
{
public:

    Base()
    {
        greet(10);
    }

    virtual void greet(int line_number)
    {
        std::cout << line_number << ". inside base class\n";
    }
};

class Derived : public Base
{
public:

    Derived()
    {
        greet(25);
    }

    virtual void greet(int line_number) override
    {
        std::cout << line_number << ". inside derived class\n";
    }
};

int main()
{
    std::unique_ptr<Base> p { new Derived };
    p->greet(37);
}
