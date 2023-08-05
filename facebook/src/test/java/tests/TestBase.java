package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.RegistrationPage;

public class TestBase {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;
    private String url = "https://www.facebook.com/";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

    }

    @AfterClass
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}
}
