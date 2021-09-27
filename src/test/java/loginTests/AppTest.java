package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test(description= "valid test")
  public void validLoginTest() {
	  App ap= new App();
	  boolean status= ap.userLogin("userdemo", "password");
	  Assert.assertTrue(status);
  }
  @Test(description= "invalid login test")
  public void invalidLoginTest() {
	  App ap= new App();
	  boolean status= ap.userLogin("userdemo", "password123");
	  Assert.assertFalse(status);
  }
  
}
