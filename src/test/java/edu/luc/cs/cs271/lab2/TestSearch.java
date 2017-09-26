package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }
  
  List<Team> makeListFixture(final int size){
    final List <Team> list = new list <Team>;
    for (int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      list[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return list;
  }

  // TODO makeListFixture
  // worked on could be wrong

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  //DONE: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0(){
    final List <Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition2(list, "Team 5").isPresent());
  }
  //DONE
  
  @Test
  public void testFindPositionList10s(){
    final List <Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition2(list, "Team 5").isPresent());
  }
  //DONE
  @Test
  public void testFindPositionList10f(){
    final List <Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition2(list, "Team 11").isPresent());
  }
  //DONE
  
  
  
  
  // TODO: testFindMinFundingArray for several sizes and scenarios
  //call findTeamMinFunding
  @Test
  public void testFindMinFundingArray0(){
   final Team[] arr = makeArrayFixture(0);
   assertFalse(Search.findTeamMinFunding(arr, 12).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray10s(){
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFunding(arr, 500).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray5f(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 30).isPresent());
  }




  // TODO: testFindMinFundingArrayFast for several sizes and scenarios
  @Test
  public void testFindMinFundingArrayFast0(){
    final List <Team> list = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 12).isPresent());
  }
  
  @Test
  public void testFindMinFundingArrayFast10(){
    final List <Team> list = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFunding(arr, 500).isPresent());
  }
  
  @Test
  public void testFindMinFundingArrayFast5f(){
    final List <Team> list = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 30).isPresent());
  }
    
    
  }

