package day7.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsask5 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/en");


        
    }
}