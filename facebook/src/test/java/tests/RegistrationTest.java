package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void registrationPage()
    {
        loginPage.navigateToRegistration();
        registrationPage.fillRegistrationForm("Ahmed","Sobhy","a3@gmail.com", "P@ssw0rd");

    }
}
