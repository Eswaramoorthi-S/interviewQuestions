package general_realtime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automatic_flipkart {

	public static void main(String[] args) throws AWTException, InterruptedException {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your searching product ");
    String search = s.next();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
    driver.findElement(By.name("q")).sendKeys(search);
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
    Thread.sleep(3000);
    Set<String> wh = driver.getWindowHandles();
    for(String allwh:wh)
    {
    driver.switchTo().window(allwh);
    }
    driver.close();
    
    
	}

}
