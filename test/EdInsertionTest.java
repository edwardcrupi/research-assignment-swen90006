import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Map;

import org.junit.*;
import static org.junit.Assert.*;

public class EdInsertionTest
{
  int[] zeroArray = {};
  int[] oneArray = {8};
  int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
  int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
  int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
  int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
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
  public void zeroTest() throws IOException
  {
    int[] zeroArray = {};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(zeroArray), zeroArray);
  }

  @Test
  public void oneTest() throws IOException
  {
    int[] oneArray = {8};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(oneArray), oneArray);
  }

  @Test
  public void manyTest() throws IOException
  {
    int[] manyArray = {8};
    int[] checkArray = {1,2,3,4,5,6,7,8,9,10};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(manyArray), checkArray);
  }

  @Test
  public void firstTest() throws IOException
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(firstArray), firstArray);
  }

  @Test
  public void lastTest() throws IOException
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(lastArray), firstArray);
  }

  @Test
  public void mixedTest() throws IOException
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    int[] checkArray = {5,5,5,5,5,6,6,6,6,6};
    assertArrayEquals(MyNonAbstractedInsertionSortWithFaults.doInsertionSort(mixedArray), checkArray);
  }
}
