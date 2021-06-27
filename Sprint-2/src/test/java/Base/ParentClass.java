package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass {
	public static WebDriver driver;
	public static Properties prop;
	public ParentClass()	
	{	

		prop=new Properties();
		FileInputStream fis;
		String path=System.getProperty("user.dir")+"//src//test//resources//elements.properties";


		try {
			fis=new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}				
	}
	public static void initialize()
	{
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F://webdriver//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//			System.setProperty("webdriver.edge.driver", "F://webdriver//edgedriver_win32//edgedriver.exe");
			//			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		boolean understand= driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).isDisplayed();
		if(understand) {
			driver.findElement(By.xpath("//button[@class='ctaText i-understand-btn text-uppercase']")).click();

		}
	}
}
