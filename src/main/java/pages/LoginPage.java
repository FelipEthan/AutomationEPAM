package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    String element1 = "//input[@id='user-name']";
    String element2 = "//input[@id='password']";
    String element3 = "//*[@id=\"login-button\"]";
    String element4 = "//div[@id='login_button_container']/div[@class='login-box']/form/div[@class='error-message-container error']/h3";
    String element5 = "//*[@id=\"header_container\"]/div[1]/div[2]/div";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void navigateToPage() {
        navigateTo("https://www.saucedemo.com/");
    }
    public void sendUser(String value) {
        this.write(element1, value);
    }
    public void sendPass(String value) {
        this.write(element2, value);
    }
    public void clickSubmit(){
        this.clickElement(element3);
    }
    public void textValidate(){
        this.textValidate(element4);
    }
    public void closessBrowser(){
        this.closeBrowser();
    }
    public void emptyField1() {
        this.emptyField1(element1);
    }
    public void emptyField2() {
        this.emptyField2(element2);
    }
    public void textValidate2(){
        this.textValidate(element5);
    }
}
