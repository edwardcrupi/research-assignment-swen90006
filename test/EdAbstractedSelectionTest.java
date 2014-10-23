import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class SimpleTest
{
  //Any method annotated with "@Before" will be executed before each test,
  //allowing the tester to set up some shared resources.
  @Before
  public void setUp()
  {
  }

  //Any method annotated with "@After" will be executed afteqr each test,
  //allowing the tester to release any shared resources used in the setup.
  @After
  public void tearDown()
  {
  }

  //Any method annotation with "@Test" is executed as a test.
  @Test
  public void aTest()
  {
    //the assertTrue method is used to check whether something holds.
    assertTrue(0 == 0);
  }

  @Test
  public void anotherTest()
  {
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");

    assertTrue(list.contains("a"));
  }

  @Test(expected = java.io.IOException.class)
  public void anExceptionTest()
    throws Throwable
  {
    throw new java.io.IOException();
  }
}
