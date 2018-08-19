package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WarInternetExplorer {

    public static void main(String[] args){

        System.setProperty("webdriver.ie.driver", "browsers//IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();

        //needed IE driver v 2.5
        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();

        String result = driver.findElement(By.xpath("//*[@id=\"title\"]/h1")).getText();
        if(result.equals("WAR")){
            System.out.println("fukin good job");
        }

    }
}
