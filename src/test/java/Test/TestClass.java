package Test;

import org.testng.annotations.Test;

import Base.baseClass;
import Login.loginClass;

public class TestClass extends baseClass {
	
	@Test
	public void LoginTest()
	{
	loginClass LO=new loginClass(driver);
	LO.loginBrowser();
	
	}
	

}
