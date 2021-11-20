package radiobuttoncheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        driver.findElement(By.xpath("//input[@name='optradio'][@value='Male']")).click();
        driver.findElement(By.id("buttoncheck")).click();

        String value=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();

        System.out.println(value);

        // Validation part

        if(value.contains("Male")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']")).click();
        driver.findElement(By.id("buttoncheck")).click();

        String value2=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();

        System.out.println(value2.contains("Female") ? "PASSED" : "FAILED");

        driver.quit();

    }

}
