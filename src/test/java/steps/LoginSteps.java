package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = BasePage.initializeDriver();
        this.loginPage = new LoginPage(this.driver);
    }

    @Given("^El usuario está en la página de inicio de sesión$")
    public void navigate() {
        this.loginPage.navigateToPage();
    }

    @When("El usuario ingresa la contraseña {string}")
    public void enterData(String contraseña) {
        this.loginPage.sendPass(contraseña);
    }

    @When("El usuario ingresa el nombre de usuario {string}")
    public void enterData2(String usuario) {
        this.loginPage.sendUser(usuario);
    }

    @And("Borra los campos de contraseña")
    public void emptyFields2() throws InterruptedException {
        this.loginPage.emptyField2();
    }

    @And("Borra los campos de usuario")
    public void emptyFields1() throws InterruptedException {
        this.loginPage.emptyField1();
    }

    @And("^El usuario hace clic en el botón de Login")
    public void clickEntrar() {
        this.loginPage.clickSubmit();
    }

    @Then("^El usuario debe ser redirigido a la pantalla inicial$")
    public void screenInit() {
        this.loginPage.textValidate();
        this.loginPage.closessBrowser();
    }

    @Then("^El sistema debe mostrar el mensaje de error se requiere nombre de usuario$")
    public void messagevalidation() {
        this.loginPage.textValidate();
    }

    @Then("^El sistema debe mostrar el mensaje de error se requiere contraseña")
    public void messagevalidation2() {
        this.loginPage.textValidate();
    }

    @When("El usuario ingresa el nombre de usuario {string} y contraseña {string}")
    public void enterData3(String usuario, String contraseña) {
        this.loginPage.sendUser(usuario);
        this.loginPage.sendPass(contraseña);
    }

    @Then("^El sistema debe mostrar el mensaje de Swag labs")
    public void messagevalidation3() {
        this.loginPage.textValidate2();
        driver.quit();
    }
}
