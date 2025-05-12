package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
    private By FIRSTNAME = By.xpath("//input[@placeholder='First Name']");
    private By LASNAME = By.xpath("//input[@placeholder='Last Name']");
    //private By LOGINBUTTON = By.xpath("//button[normalize-space()='LOGIN']");
    private By button = By.tagName("button");
    private By gender = By.xpath("//input[@value='FeMale']");

//FeMale

    public void firstName(String username) {
        writeText(FIRSTNAME, username);
    }

    public void lastName(String password) {
        writeText(LASNAME, password);
    }

//    public void cliONLoginButton() {
//        clickOnElement(LOGINBUTTON);
//    }

    public void doRegister(String firstName, String lastName) {
        writeText(FIRSTNAME, firstName);
        writeText(LASNAME, lastName);
        //clickOnElement(Register);
    }
    public void button() {

        clickOnElement(button);
    }
    public void genderclick() {

        clickOnElement(gender);
    }

}
