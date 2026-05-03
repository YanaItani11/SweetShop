package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.DriverProvider.*;

public class LogInPage {
public String emailAddressId = "exampleInputEmail";
public String passwordId = "exampleInputPassword";
public String LogInBtnId = "btn_login";
public String transactionChartId = "transactionChart";
public String logInBtnXpath = "//a[contains(@class,'nav-link') and @href='/login']";



    public void successfulLogIn(String login, String password) {
        WebElement logInBtn = getCurrentDriver().findElement(By.xpath(logInBtnXpath));
        getCurrentWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logInBtnXpath)));

        logInBtn.click();

        WebElement emailAddress = getCurrentDriver().findElement(By.id(emailAddressId));
        getCurrentWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(emailAddressId)));

        emailAddress.sendKeys(login);

        WebElement Password = getCurrentDriver().findElement(By.id(passwordId));
        Password.sendKeys(password);

        WebElement LogInBtn = getCurrentDriver().findElement(By.id(LogInBtnId));
        LogInBtn.click();
        getCurrentWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(transactionChartId)));
    }


        public Boolean loginWithEmailIsSuccesful() {

        WebElement transcriptionChart = getCurrentDriver().findElement(By.id(transactionChartId));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(transactionChartId)));


            if (transcriptionChart.isDisplayed()) {
                return true;
            } else {

                return false;
                }
            }






    }



