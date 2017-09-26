package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  
  
  public void testConstructorValidHeadcoach(){
    try {
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
    }
    catch (final Throwable ex){
      
    }
  }
  // TODO testConstructorValidHeadcoach
  // worked on 
  
  public void testConstructorValidFunding(){
    try {
      new Team("USA", "Klinsmann", null);
      fail("should have thrown IllegalArgumentException");
    }
    catch (final Throwable ex){
      
    }
  }
  // TODO testConstructorValidFunding
  // worked on 

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  
  public void testGetHeadcoach(){
    final String headcoach = "Klinsmann";
    assertEquals(headcoach = t.getHeadcoach());
    
  }
  
  // TODO testGetHeadcoach
  // Worked on 
  
  
  
  public void testGetFunding(){
    final String funding = 500;
    assertEquals(funding = t.getFunding());
    
    
    
  }
  // TODO testGetFunding
  // Worked on
}