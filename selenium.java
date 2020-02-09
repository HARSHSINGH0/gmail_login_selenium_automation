/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium_test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author hs475
 * @author harsh singh
 */
public class Selenium_test {

    /**
     * @param args the command line arguments
     * 
     */
    public static WebDriver driver=null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("wendriver.chrome.driver","C:\\Users\\hs475\\Documents\\NetBeansProjects\\selenium_test\\src\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.gmail.com");
        WebElement loginemail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
        loginemail.sendKeys("emailid");
        WebElement nextbtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
        nextbtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginpasswd = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
        
        loginpasswd.sendKeys("password");
        nextbtn=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
        
        nextbtn.click();
        
        
        
        
        
    }
    
}
