package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSmartApp {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","/Users/mindtekbatch3/IdeaProjects/MindtekSeleniumProject/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = driver.getTitle();

        if(title.equals("Web Orders")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        driver.quit();

    }

}
