package org.allcorn.twoArrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoArrayTest {
  
  /** see if object is created
   * 
   */
  @Test
  public void testCreate() {
    TwoArrays theArrays = new TwoArrays();
    
    assertNotNull(theArrays);
  }
  
  /** test match in middle
   * 
   * @throws Exception
   */
  @Test
  public void testArrays() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {2,3,4,5,6,7};
    int[] array2 = {4,5};
    
    
    assertTrue((theArrays.getStartingPos(array1,array2)) == 2);
  }
  
  /** test large match 
   * 
   * @throws Exception
   */
  @Test
  public void testLargeArray() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {2,3,4,5,6,7};
    int[] array2 = {3,4,5,6};
    
    
    assertTrue((theArrays.getStartingPos(array1,array2)) == 1);
  }
  
  
  /** test too large match 
   * 
   * @throws Exception
   */
  @Test(expected=Exception.class)
  public void testToLargeArray() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {2,3,4,5,6,7};
    int[] array2 = {3,4,5,6,7,8,9,10};
    
    
    int x = theArrays.getStartingPos(array1,array2);
  }
  
  /** first possible match
   * @throws Exception 
   * 
   */
  @Test
  public void testArrays2() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    int[] array2 = {9,10};
    
    
    assertTrue((theArrays.getStartingPos(array1,array2)) == 8);
  }
  
  /** last possible match
   * @throws Exception 
   * 
   */
  @Test
  public void testArrays3() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    int[] array2 = {1,2};
    
    
    assertTrue((theArrays.getStartingPos(array1,array2)) == 0);
  }
  
  /** no match
   * @throws Exception 
   * 
   */
  @Test(expected=Exception.class)
  public void testArrays4() throws Exception {
    
    TwoArrays theArrays = new TwoArrays();
    
    int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    int[] array2 = {11,12};
    
    
    int x = theArrays.getStartingPos(array1,array2);
  }


}
