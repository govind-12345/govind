package edge;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class youtubelogin 
{
	public EdgeDriver driver;
	@Test
	public void test()
	{
		System.setProperty("driver.Edge.driver","../YTEdge/msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://www.youtube.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.quit();
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void Amethod()
	{
		
		System.out.println("After Method");
	}

}
