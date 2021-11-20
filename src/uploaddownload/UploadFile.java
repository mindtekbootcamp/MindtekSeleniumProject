package uploaddownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chrome","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("/Users/mindtekbatch3/Desktop/image.jpeg");
        driver.findElement(By.id("file-submit")).click();

        String message = driver.findElement(By.tagName("h3")).getText();

        System.out.println(message);

        if(message.equals("File Uploaded!")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

    }

}
