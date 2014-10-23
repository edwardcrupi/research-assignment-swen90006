import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Map;

import org.junit.*;
import static org.junit.Assert.*;

public class ProjectTest
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

  @Test
  public void oneLineOneTgt() throws IOException
  {
    String file = "Equivalence Partition Tests/oneLineOneTgt.txt";
    String target = "test";
    int numMatches = 0;
    Map<Integer, Integer> count = WordCount.countfile(file, target);

    System.out.println("Word: " + target + "; file " + file);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue() != 0)
        numMatches++;
    }

    assertTrue(numMatches == 1);
  }

  @Test
  public void oneLineNoTgt() throws IOException
  {
    String file = "Equivalence Partition Tests/oneLineNoTgt.txt";
    String target = "test";
    int numMatches = 0;
    Map<Integer, Integer> count = WordCount.countfile(file, target);

    System.out.println("Word: " + target + "; file " + file);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue() != 0)
        numMatches++;
    }

    assertTrue(numMatches == 0);
  }

  @Test
  public void oneLine10Tgt() throws IOException
  {
    String file = "Equivalence Partition Tests/oneLineTenTgts.txt";
    String target = "test";
    int numMatches = 0;
    Map<Integer, Integer> count = WordCount.countfile(file, target);

    System.out.println("Word: " + target + "; file " + file);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue() != 0)
        numMatches++;
    }

    assertTrue(numMatches == 10);
  }

  @Test
  public void hundredLinesOneTgt() throws IOException
  {
    String file = "Equivalence Partition Tests/100Line1Tgt.txt";
    String target = "test";
    int numMatches = 0;
    Map<Integer, Integer> count = WordCount.countfile(file, target);

    System.out.println("Word: " + target + "; file " + file);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue() != 0)
        numMatches++;
    }

    assertTrue(numMatches == 1);
  }

  @Test
  public void hundredLinesTenTgts() throws IOException
  {
    String file = "Equivalence Partition Tests/100Line10Tgts.txt";
    String target = "test";
    int numMatches = 0;
    Map<Integer, Integer> count = WordCount.countfile(file, target);

    System.out.println("Word: " + target + "; file " + file);
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue() != 0)
        numMatches++;
    }

    assertTrue(numMatches == 0);
  }

  @Test(expected = java.io.IOException.class)
  public void invalidCharExceptionTest()
    throws Throwable
  {
    String file = "Equivalence Partition Tests/invalidCharTest.txt";
    String target = "test";
    Map<Integer, Integer> count = WordCount.countfile(file, target);

  }

  @Test(expected = java.io.IOException.class)
  public void noFileExceptionTest()
    throws Throwable
  {
    String file = "Equivalence Partition Tests/nonExistantFile.txt";
    String target = "test";
    Map<Integer, Integer> count = WordCount.countfile(file, target);
    
  }
}
