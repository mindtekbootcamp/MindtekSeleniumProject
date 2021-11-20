package uploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chrome","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[@href='download/emp1.png']")).click();

    }

}
