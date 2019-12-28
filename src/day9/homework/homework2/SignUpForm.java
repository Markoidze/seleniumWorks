package day9.homework.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUpForm {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/manuchar.markoidze.PCSST/Desktop/MySelenium/selenium/selenium/selenium/src/day9/homework/homework1/SignUpForm.html");
        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.name("text"));
        text.sendKeys("Mark");
        WebElement webElement = driver.findElement(By.name("password"));
        webElement.sendKeys("Password");

        WebElement reEnterPassword = driver.findElement(By.name("repassword"));
        reEnterPassword.sendKeys("Password");

        WebElement textarea = driver.findElement(By.name("textarea"));
        textarea.sendKeys("123 main street Clifton Nj 07011");

        List<WebElement> radio = driver.findElements(By.name("Male"));
        WebElement SexOptions = radio.get(0);// [0, 1, 2]
        SexOptions.click();

        WebElement select = driver.findElement(By.name("select"));
        Select dropdown = new Select(select);
        dropdown.selectByIndex(2);

        WebElement AgreementCheckbox = driver.findElement(By.name("checkbox"));
        AgreementCheckbox.click();
        WebElement submitButton = driver.findElement(By.name("Submit button"));
        submitButton.click();

    }
}