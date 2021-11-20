package radiobuttoncheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chrome","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        driver.findElement(By.id("isAgeSelected")).click();
        String value=driver.findElement(By.id("txtAge")).getText();

        System.out.println(value);

        if(value.equals("Success - Check box is checked")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.findElement(By.id("check1")).click();

        String buttonText=driver.findElement(By.id("check1")).getAttribute("value");

        System.out.println(buttonText);

        if(buttonText.equals("Uncheck All")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        // Uncheck two checkboxes, then validate that button text is 'Check All'

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox'][@class='cb1-element']"));

        checkboxes.get(0).click();
        checkboxes.get(1).click();

        String buttonText2=driver.findElement(By.id("check1")).getAttribute("value");

        System.out.println(buttonText2);

        if(buttonText2.equals("Check All")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.quit();

    }

}
