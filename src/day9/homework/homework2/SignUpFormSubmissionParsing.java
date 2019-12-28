package day9.homework.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SignUpFormSubmissionParsing {
    /**
     * open SignUpForm.html
     * fill in your data inside the all input elements
     * submit the form
     * get URL
     * parse values that was submitted and print them out
     * hint: https://examples.javacodegeeks.com/core-java/net/url/parse-url-example/
     * like nameOfTheInput = valueOfTheInput
     */

    public static void main(String[] args) throws InterruptedException, MalformedURLException{
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

        WebElement agreementCheckbox = driver.findElement(By.name("checkbox"));
        agreementCheckbox.click();

        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        String url = driver.getCurrentUrl();
        parseUrl(driver, url);

        Thread.sleep(2000);
        driver.quit();
    }

    private static void parseUrl(WebDriver driver, String url) throws MalformedURLException {
        URL myUrl = new URL(url);
        String sentKeys = myUrl.getQuery();
        for (String str: sentKeys.split("&")) {
            System.out.println(str);
        }
    }
}
