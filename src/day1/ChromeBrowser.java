package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techno.study/" );
        WebElement text = driver.findElement( By.name( "text" ) );
        text.sendKeys( "This is my text" );
        WebElement webElement = driver.findElement( By.name( "password" ) );
        webElement.sendKeys( "Password" );
    }
}
