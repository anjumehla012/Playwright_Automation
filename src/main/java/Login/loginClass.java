package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginClass {
	
	public WebDriver driver;

	public loginClass (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginBrowser()
	{
	//CLick on Login
	driver.findElement(By.linkText("Login")).click();
	
	//Enter username
	driver.findElement(By.id("username")).sendKeys("student");
	
	//Enter Password
	driver.findElement(By.id("password")).sendKeys("Password123");
	
	//Click on Login
	driver.findElement(By.id("loginSubmitBtn")).click();
	}
}
