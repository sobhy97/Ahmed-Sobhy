package pages;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginPage {
    private WebDriver driver;
    private By email = By.id("email");
    private By password = By.id("pass");
    private By loginBttn = By.xpath("//button[@type='submit']");
    private By goToRegisterPage = By.xpath("//a[@data-testid='open-registration-form-button']");
    CSVReader reader;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void navigateToRegistration()
    {
        driver.findElement(goToRegisterPage).click();
    }

    public void fillWithLoginCredentials() throws IOException, CsvValidationException {
        String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/userData.csv";
        reader = new CSVReader(new FileReader(CSV_file));
        String[] csvCell;
        //while loop will be executed till the last value in csv file
        while ((csvCell = reader.readNext() ) != null )
        {
            String mail = csvCell[0];
            String pass = csvCell[1];
            driver.findElement(email).sendKeys(mail);
            driver.findElement(password).sendKeys(pass);
            driver.findElement(loginBttn).click();


        }

    }
}
