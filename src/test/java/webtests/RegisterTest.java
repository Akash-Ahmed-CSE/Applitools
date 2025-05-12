package webtests;

import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.DriverSetup;

public class RegisterTest extends DriverSetup {

    private Eyes eyes;
    private WebDriver driver;
    RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        // Initialize Eyes (no runner)
        eyes = new Eyes();
        eyes.setApiKey("Snk2FsEGV8rU6L111dx3h2slgkhCFwb7LHlpX44r137RA110");

        // Setup driver and page
        driver = getDriver();
        registerPage = new RegisterPage();
    }

    @Test
    public void registerVisualTest() throws InterruptedException {
        try {
            // Start Applitools test
            eyes.open(driver, "Demo App01", "Register Page Test01");

            driver.get("https://demo.automationtesting.in/Register.html");

            registerPage.doRegister("Akash", "Ahmed");

            eyes.check("Registration Page no gender", Target.window());
            registerPage.genderclick();
            eyes.check("Registration Page gender added", Target.window());
            Thread.sleep(2000);


            // End test and close Eyes
            eyes.close();
        } catch (Exception e) {
            e.printStackTrace();
            eyes.abortIfNotClosed();
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
