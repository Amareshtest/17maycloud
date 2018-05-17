package TCS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	
	
	@Test
	public static void tescase()
	{
		 WebDriver wd = null;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ptn\\Desktop\\chromedriver.exe");
			 wd = new ChromeDriver();
			 wd.get("http://10.120.57.65:8080/Prime/login");
			 wd.manage().window().maximize();
			wd.findElement(By.id("username")).sendKeys("Pkumar4");
			wd.findElement(By.id("password")).sendKeys("test@1234");
			wd.findElement(By.id("btn-login")).click();
			System.out.println("browser launced successfully1");
	}

}
