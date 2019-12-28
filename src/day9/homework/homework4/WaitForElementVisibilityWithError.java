package day9.homework.homework4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class WaitForElementVisibilityWithError {
    /**
     * Open "http://the-internet.herokuapp.com/dynamic_controls"
     *
     * click on "Remove" button
     * wait for checkbox to disappear within 2 seconds
     * if checkbox does not disappear print failure
     * if test fails take a screenshot and store inside homework4 folder
     * This test must fail
     **/


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();


        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.manage().window().maximize();

        WebElement remove = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
        remove.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkbox-example']/p")));
        if (driver.findElement(By.xpath("//form[@id='checkbox-example']/p")).getText().equalsIgnoreCase("it's gone!")) {
            System.out.println("remove message: success");
        } else {
            System.out.println("remove message: failure");
        }
    }
}