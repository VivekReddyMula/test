package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void Test() 
  {
	  System.out.print("I am in Before Method");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.print("I am in Before Method"); 
	 
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.print("I am in After Method");
  }

}
