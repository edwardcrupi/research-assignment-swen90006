

#include "lib/TestHarness.h"
#include "MyTestClass.h"


class MyFixtureSetup : public TestSetup
{
public:
    void setup()
    {
        someValue = 2.0;
        str = "Hello";
    }

    void teardown()
    {
    }
    
protected:
    float someValue;
    std::string str;
    MyTestClass myObject;
};



TESTWITHSETUP (MyFixture,Test1)
{  
    CHECK_DOUBLES_EQUAL (someValue, 2.0f);
    someValue = 0;

    // CppUnitLite doesn't handle system exceptions very well either
    //myObject.UseBadPointer();

    // A regular exception works nicely though
    myObject.ThrowException();
}

TESTWITHSETUP (MyFixture,Test2)
{
    CHECK_DOUBLES_EQUAL (someValue, 2.0f);
    CHECK_STRINGS_EQUAL (str, std::string("Hello"));
}


TESTWITHSETUP (MyFixture,Test3)
{
    // Unfortunately, it looks like the framework creates 3 instances of MyTestClass
    // right at the beginning instead of doing it on demand for each test. We would
    // have to do it dynamically in the setup/teardown steps ourselves.
    CHECK_LONGS_EQUAL (1, myObject.s_currentInstances);
    CHECK_LONGS_EQUAL (3, myObject.s_instancesCreated);
    CHECK_LONGS_EQUAL (1, myObject.s_maxSimultaneousInstances);
}
    
