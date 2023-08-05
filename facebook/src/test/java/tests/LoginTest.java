package tests;

import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {


    @Test
    public void fillLoginPage() throws IOException, CsvValidationException {
        loginPage.fillWithLoginCredentials();
    }

}
