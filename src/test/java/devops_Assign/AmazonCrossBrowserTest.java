package devops_Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonCrossBrowserTest {
	WebDriver driver;
	@Parameters({"bname"})
     @Test
	public void browserTest(String bname) {
		if(bname.contains("Chrome")) {
			driver=new ChromeDriver();
			
		}else if(bname.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();

		}else if(bname.contains("edge")) {
			driver=new EdgeDriver();
		
	
		}
		driver.get("https://www.amazon.com/");
	}


  }

