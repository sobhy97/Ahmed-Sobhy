package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {

        private WebDriver driver;
        private By firstName = By.xpath("//input[@name='firstname']");
        private By lastName = By.xpath("//input[@name='lastname']");
        private By email = By.xpath("//input[@name='reg_email__']");
        private By confirmEmail = By.xpath("//input[@name='reg_email_confirmation__']");
        private By password = By.id("password_step_input");
        private By gender = By.xpath("//input[@value='2']");
        private By register = By.xpath("//button[@name='websubmit']");



    public RegistrationPage(WebDriver driver)
        {
            this.driver = driver;
        }

        public void fillRegistrationForm(String firstname, String lastname , String mail , String pass)
        { driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(firstName).sendKeys(firstname);
            driver.findElement(lastName).sendKeys(lastname);
            driver.findElement(email).sendKeys(mail);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(confirmEmail).sendKeys(mail);
            driver.findElement(password).sendKeys(pass);
            Select selectDay = new Select(driver.findElement(By.id("day")));
            selectDay.selectByIndex(0);
            Select selectMonth = new Select(driver.findElement(By.id("month")));
            selectMonth.selectByIndex(0);
            Select selectYear = new Select(driver.findElement(By.id("year")));
            selectYear.selectByIndex(20);
            driver.findElement(gender).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(register).click();




        }
}
