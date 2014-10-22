
#include "MyTestClass.h"
#include <algorithm>
#include <stdexcept>


int MyTestClass::s_currentInstances;
int MyTestClass::s_instancesCreated;
int MyTestClass::s_maxSimultaneousInstances;

MyTestClass::MyTestClass()
{
    ++s_currentInstances;
    ++s_instancesCreated;    
    s_maxSimultaneousInstances = std::max(s_maxSimultaneousInstances, s_currentInstances);
}

MyTestClass::~MyTestClass()
{
    --s_currentInstances;    
}

bool MyTestClass::UseBadPointer() const
{
    int * p = 0;
    *p = 32;
}


bool MyTestClass::DivideByZero() const
{
    int i = 1, j = 0;
    i = i / j;
}


void MyTestClass::ThrowException() const
{
    throw(std::bad_alloc());
}
