package commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public static WebDriver driver;
	public static Properties config = new Properties();

	public BaseClass(){
		Property();
	}

	public void OpenBrower(){
		String browser = config.getProperty("browser");
		int implicitWaitTimeInSecs = Integer.parseInt(config.getProperty("implicitWait"));

		if (browser.equals("firefox")) {
			try{
				System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
				driver = new FirefoxDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(implicitWaitTimeInSecs, TimeUnit.SECONDS);
				System.out.println("Firefox Browser - Launched Successfully");
			}
			catch (WebDriverException wde) {
				System.err.println("Driver closed unexpectedly");
			}
		}

		else if (browser.equals("chrome")){
			try{
				String exePath = "drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(implicitWaitTimeInSecs,TimeUnit.SECONDS);
				System.out.println("Chrome Browser - Launched Successfully");
			}
			catch (WebDriverException wde) {
				System.err.println("Driver closed unexpectedly");
			}
		}

		else if (browser.equals("ie")){
			try{
				String exePath = "drivers\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", exePath);
				driver = new InternetExplorerDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(implicitWaitTimeInSecs,TimeUnit.SECONDS);
				System.out.println("Internet Explorer Browser - Launched Successfully");
			}
			catch (WebDriverException wde) {
				System.err.println("Driver closed unexpectedly");
			}

		}else {
			try {
				String exePath = "drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				driver = new ChromeDriver(options);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(implicitWaitTimeInSecs, TimeUnit.SECONDS);
				System.out.println("Chrome Browser - Launched Successfully");
			} catch (WebDriverException wde) {
				System.err.println("Driver closed unexpectedly");
			}
		}
	}

	public void Property(){
		try {
			File file = new File("src\\test\\java\\resources\\default.properties");
			FileInputStream fis = new FileInputStream(file);
			config.load(fis);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}