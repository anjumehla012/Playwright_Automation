package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	public WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://playwrightautomation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String ExpectedTitle="Playwright Automation Platform — Real apps, built to be automated";
		wait.until(ExpectedConditions.titleContains(ExpectedTitle));
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println(ActualTitle +" is correct");
		}
		else
		{
			System.out.println(ActualTitle+" is incorrect");
		}
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
