COMPILER = g++
CCFLAGS = -g -ansi
LIBFLAGS = /usr/local/lib/libcppunit.a

%.o : %.cpp
	$(COMPILER) $(CCFLAGS) -c $<

objects = main.o MyTestClass.o simplest_test.o fixture_test.o

all: test

test: $(objects) 
	${COMPILER} -o test $(objects) ${LIBFLAGS} 
	./test
    
main.o: main.cpp
MyTestClass.o: MyTestClass.cpp
simplest_test.o: simplest_test.cpp
fixture_test.o: fixture_test.cpp


clean:
	rm $(objects) test
