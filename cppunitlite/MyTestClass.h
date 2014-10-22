
#ifndef MYTESTCLASS_H
#define MYTESTCLASS_H

class MyTestClass
{
public:
    MyTestClass();
    ~MyTestClass();
	
	bool UseBadPointer() const;
    bool DivideByZero() const;
    void ThrowException() const;
	
    
    static int s_currentInstances;
    static int s_instancesCreated;
    static int s_maxSimultaneousInstances;
};


#endif
