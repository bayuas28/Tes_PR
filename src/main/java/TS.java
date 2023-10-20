import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},
        glue="steps",
        plugin = { "pretty", "json:target/cucumber-reports/report.json", "html:target/cucumber-report-html/"})

public class TS {
    WebDriver driver;
    @Given("Open browser")
    public void openBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @And("Open website saucedemo")
    public void openWebsiteSaucedemo() {
        driver.get("https://www.saucedemo.com/");
    }

    @And("Insert Username with standard_user")
    public void insertUsernameWithStandard_user() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        WebElement username = driver.findElement(By.name("user-name"));
//        username.sendKeys("standard_user");
    }

    @And("Insert Password with secret_sauce")
    public void insertPasswordWithSecret_sauce() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("Click Login")
    public void clickLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Logged in")
    public void loggedIn() {
        driver.findElement(By.className("shopping_cart_link")).isDisplayed();
        System.out.println("Login Done with Click");
    }

    @And("Insert Password with no_secret_sauce")
    public void insertPasswordWithNo_secret_sauce() {
        driver.findElement(By.id("password")).sendKeys("no_secret_sauce");
    }

    @Then("Not Logged in")
    public void notLoggedIn() {
        driver.findElement(By.className("login_logo")).isDisplayed();
        System.out.println("Login Failed with wrong password");
    }

    @And("Click add to cart Sauce Labs Backpack")
    public void clickAddToCartSauceLabsBackpack() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("Click add to cart Sauce Labs Bike Light")
    public void clickAddToCartSauceLabsBikeLight() {
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    @And("Click Shopping Cart Icon Button")
    public void clickShoppingCartIconButton() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("Go to Cart Page")
    public void goToCartPage() {
        driver.findElement(By.id("checkout")).isDisplayed();
        System.out.println("Show Cart Page Done");
    }

    @And("Click Checkout")
    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }

    @And("Fill Checkout First Name information")
    public void fillCheckoutFirstNameInformation() {
        driver.findElement(By.id("first-name")).sendKeys("Bayu");
    }

    @And("Fill Checkout Last Name information")
    public void fillCheckoutLastNameInformation() {
        driver.findElement(By.id("last-name")).sendKeys("Asmoro");
    }

    @And("Fill Checkout Zip Postal Code information")
    public void fillCheckoutZipPostalCodeInformation() {
        driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @Then("Continue to Overview Checkout Page")
    public void continueToOverviewCheckoutPage() {
        driver.findElement(By.id("continue")).click();
    }

    @Then("Finish Checkout")
    public void finishCheckout() {
        driver.findElement(By.id("checkout_summary_container")).isDisplayed();
        driver.findElement(By.id("finish")).click();
    }

    @Given("Checkout Complete Page")
    public void checkoutCompletePage() {
        driver.findElement(By.id("checkout_complete_container")).isDisplayed();
    }

    @Given("Checkout Information Request")
    public void checkoutInformationRequest() {
        driver.findElement(By.className("checkout_info_wrapper")).isDisplayed();
    }
}
