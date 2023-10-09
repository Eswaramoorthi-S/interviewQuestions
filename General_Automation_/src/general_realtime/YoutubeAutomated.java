package general_realtime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeAutomated {

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the search title");
		String n=s.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/");
        driver.findElement(By.name("search_query")).sendKeys(n);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		Thread.sleep(300000);
		
		}

}
