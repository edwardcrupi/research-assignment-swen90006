#include <cppunit/extensions/HelperMacros.h>
#include "MyTestClass.h"


class FixtureTest : public CPPUNIT_NS::TestFixture
{
  CPPUNIT_TEST_SUITE( FixtureTest );
  CPPUNIT_TEST( Test1 );
  CPPUNIT_TEST( Test2 );
  CPPUNIT_TEST( Test3 );
  CPPUNIT_TEST_SUITE_END();

protected:
  float someValue;
  std::string str;
  MyTestClass myObject;

public:
  void setUp();

protected:
  void Test1();
  void Test2();
  void Test3();
};


CPPUNIT_TEST_SUITE_REGISTRATION( FixtureTest );

void FixtureTest::setUp()
{
  someValue = 2.0;
  str = "Hello";
}

void FixtureTest::Test1()
{
  CPPUNIT_ASSERT_DOUBLES_EQUAL( someValue, 2.0f, 0.005f );
  someValue = 0;
  
  //System exceptions cause CppUnit to stop dead on its tracks
  //myObject.UseBadPointer();
    
  // A regular exception works nicely though
  myObject.ThrowException();
}


void FixtureTest::Test2()
{
  CPPUNIT_ASSERT_DOUBLES_EQUAL( someValue, 2.0f, 0.005f );
  CPPUNIT_ASSERT_EQUAL (str, std::string("Hello"));
}

void FixtureTest::Test3()
{ 
    // This also causes it to stop completely
    //myObject.DivideByZero();

    // Unfortunately, it looks like the framework creates 3 instances of MyTestClass
    // right at the beginning instead of doing it on demand for each test. We would
    // have to do it dynamically in the setup/teardown steps ourselves.
    CPPUNIT_ASSERT_EQUAL (1, myObject.s_currentInstances);
    CPPUNIT_ASSERT_EQUAL (3, myObject.s_instancesCreated);
    CPPUNIT_ASSERT_EQUAL (1, myObject.s_maxSimultaneousInstances);
}

