package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty( "webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
