package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("carpet"+ Keys.ENTER);

        driver.manage().window().maximize();

        driver.quit();

    }

}
