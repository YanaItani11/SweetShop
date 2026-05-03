package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LogInPage;

public class login extends BaseTest{

    @Test(enabled = true)
    @Parameters({"login", "password"})
    public void LogInSuccessful(String login, String password)
    {
        LogInPage logInPage = new LogInPage();
        logInPage.successfulLogIn(login, password);

        Assert.assertTrue(logInPage.loginWithEmailIsSuccesful());
    }
}
