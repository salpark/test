package org.allcorn.twoArrays;

/**
 * Class to compare to arrays and identify the start of one inside the other
 * @author carstain@allcorn.org
 *
 */
public class TwoArrays {

  
  public static void main(String[] args) throws Exception {
    
    TwoArrays thisInstance = new TwoArrays();
    
    int[] array1 = {2,3,4,5};
    int[] array2 = {4,5};
    
    int startPosition = thisInstance.getStartingPos(array1,array2);
    
    System.out.println("match at position [" + startPosition + "]");
    
  }
  
  
  /**
   * Find the first occurrence of array2 in array1. array2 must have a complete match
   * in array1
   * @param array1 the array to be searched
   * @param array2 the array match we are looking for somewhere in 
   *               array1
   * @return the index of array1 that matches the first element of array2
   * @throws Exception if no match can be found.
   */
  public int getStartingPos(int[] array1, int[] array2) throws Exception {
    
    int array1TestStartPosition = 0;
    boolean found = false;
    
    // we can't have a match as array1 is not long
    // enough to contain array2
    if(array2.length > array1.length) {
      throw new Exception("Array1 too short");
    }
    // loop until a match is found
    while(!found)
    { 
      found = true;
       
      int array1Pos = array1TestStartPosition;
      
      if(array1Pos > array1.length) {
        // we've reached the end of array1 with no match
        throw new Exception("No match");
      }

      System.out.println("Start match");
      
      for(int array2Item : array2) {        
        System.out.println("  Array2 item=[" + array2Item + "] array1 position=[" + array1Pos + "] array1 value=[" + array1[array1Pos] + "]"  );
        if(array2Item != array1[array1Pos]) {
          //An element of array2 has not been matched
          found = false;
        }
        array1Pos++;
      }
      
      System.out.println("End match: found=[" + found + "]");
      
      
      if(!found) {       
        array1TestStartPosition++;
      }
    }
     
    return array1TestStartPosition;
  }

}
