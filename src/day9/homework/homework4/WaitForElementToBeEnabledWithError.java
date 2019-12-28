package day9.homework.homework4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class WaitForElementToBeEnabledWithError {
    /**
     * Open "http://the-internet.herokuapp.com/dynamic_controls"
     *
     * click on "Enable" button
     * wait for <input> of type="text" to be enabled within 2 seconds
     * if <input> of type="text" is still disabled print "Failure"
     * if test failed, take a screenshot and store it in homework4 folder
     * This test must fail
     **/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.manage().window().maximize();

        WebElement enable = driver.findElement(By.xpath("//form[@id='input-example']/button"));
        enable.click();

        WebDriverWait wait = new WebDriverWait(driver, 2);
        if (driver.findElement(By.xpath("//p[@id='message']")).getText().contains("enabled")) {
            System.out.println("enable: success");
        } else {
            System.out.println("enable: failure");
            takeScreenShot(driver);
        }

        // needs improvement - still not complete

        Thread.sleep(3000);
        driver.quit();
    }

    private static void takeScreenShot(WebDriver driver) {
        File homework4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filePath = "file://Users/RefiaSena/Desktop/homework4";

        try {
            FileUtils.copyFile(homework4, new File(filePath+1+".png"));
            System.out.println("***Placed screen shot in "+filePath+" ***");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
