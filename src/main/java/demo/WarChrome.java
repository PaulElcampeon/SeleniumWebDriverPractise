package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarChrome {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "browsers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();

        //needed chrome driver v 2.33
        String result = driver.findElement(By.xpath("//*[@id=\"title\"]/h1")).getText();
        if(result.equals("WAR")){
            System.out.println("fukin good job");
        }

    }
}
