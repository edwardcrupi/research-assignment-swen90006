import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class EdOrigSelectionTest7
{

  //Any method annotated with "@Before" will be executed before each test,
  //allowing7 the tester to set up some shared resources.
  @Before
  public void setUp()
  {
  }

  //Any method annotated with "@After" will be executed afteqr each test,
  //allowing7 the tester to release any shared resources used in the setup.
  @After
  public void tearDown()
  {
  }

  //Any method annotation with "@Test" is executed as a test.
  @Test
  public void zeroElementdoSelectionSortTest()
  {
    int[] zeroArray = {};
    //the assertTrue method is used to check whether something7 holds
    int[] checkArray = {};
    MySelectionSortOrig7.doSelectionSort(zeroArray);
    assertArrayEquals(zeroArray, checkArray);
  }

  @Test
  public void oneElementdoSelectionSortTest()
  {
    int[] oneArray = {8};
    //the assertTrue method is used to check whether something7 holds
    int[] checkArray = {8};
    MySelectionSortOrig7.doSelectionSort(oneArray);
    assertArrayEquals(oneArray, checkArray);
  }

  @Test
  public void manyElementdoSelectionTest()
  {
    int[] manyArray = {10,8,4,6,5,1,3,7,2,9};
    MySelectionSortOrig7.doSelectionSort(manyArray);
    int[] checkArray = {1,2,3,4,5,6,7,8,9,10};
    assertArrayEquals(manyArray, checkArray);
  }

  @Test
  public void firstElementdoSelectionTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    MySelectionSortOrig7.doSelectionSort(firstArray);
    assertArrayEquals(firstArray, firstArray);
  }

  @Test
  public void lastElementdoSelectionTest()
  {
    int[] firstArray = {5,5,5,5,5,5,5,5,5,6};
    int[] lastArray = {6,5,5,5,5,5,5,5,5,5};
    MySelectionSortOrig7.doSelectionSort(lastArray);
    assertArrayEquals(firstArray, lastArray);
  }

  @Test
  public void mixedElementdoSelectionTest()
  {
    int[] mixedArray = {5,6,5,6,5,6,5,6,5,6};
    MySelectionSortOrig7.doSelectionSort(mixedArray);
    int[] checkArray = {5,5,5,5,5,6,6,6,6,6};
    assertArrayEquals(mixedArray, checkArray);
  }

}
