package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class intialize {

	public WebDriver driver;

	public Properties prop;

	public WebDriver intializedriver() throws IOException {

		prop = new Properties();

		String propath = System.getProperty("user.dir") + "\\src\\main\\java\\base\\data.properties";

		FileInputStream fis = new FileInputStream(propath);

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		else if (browsername.equalsIgnoreCase("IE"))

		{
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;

	}

}
