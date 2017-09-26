package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    
    final int size = arr.length;            // Gets the array size
    for (int i = 0; i < size; i++) {        // Runs through a for loop to check
      if (arr[i].getName().equals(key)) {   // Gets the current item at index and compare name to key
        return Optional.of(i);              // Return the index of where the item with key is located
      }
    }
    return Optional.empty();                // If it does not exist in the array then return an index of -1
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition2(final List<Team> list, final String key) {
    
    final int size = list.size();
    for (int i = 0; i < size; i++){
      
      if (list.get(i).getName().equals(key)){
      return Optional.of(i);
      }
    }
    return Optional.empty();
  }
  
    // DONE complete this method
  
  
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    
    final int size = arr.length;
    for(int i=0; i < size; i++){
      if(minFunding < arr[i].getFunding()){
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }
    
    // DONE complete this method

  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    
    
    // DONE complete this method
    // Gets the array size
    final int size = arr.length;
                                  // Initially search the entire array
    int low = 0;
    int high = size - 1;          // Keep going as long as there is more than one item to be checked
                                  // Eliminate the wrong half of the array
                                  // Return current item only if it meets the condition!
    int mid = (high + low)/2;
    while (low <= high){
      if (minFunding == arr[mid].getFunding()){
        return Optional.of(mid);
      }
      else if (minFunding < arr[mid].getFunding()){
        high = mid - 1;
      }
      else if (minFunding > arr[mid].getFunding()){
        low = mid +1;
      }
    }
    return Optional.empty();
  }
}
