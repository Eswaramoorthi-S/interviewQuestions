package general_realtime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/");
    driver.findElement(By.partialLinkText("Create new account")).click();
    driver.findElement(By.xpath("//input[@name='firstname' and @placeholder='First name']")).sendKeys("Selenium");
    driver.findElement(By.xpath("//input[@name='lastname' and @data-type='text']")).sendKeys("WebDriver");
   driver.findElement(By.id("password_step_input")).sendKeys("ABCD@123");
    driver.findElement(By.xpath("//input[@name='reg_email__' and @data-type='text']")).sendKeys("ABCD123@gmail.com");
    WebElement date = driver.findElement(By.name("birthday_day"));
    Select s=new Select(date);
    s.selectByValue("21");
    WebElement month = driver.findElement(By.id("month"));
    Select s1=new Select(month);
    s1.selectByValue("3");
    WebElement year = driver.findElement(By.id("year"));
    Select s2=new Select(year);
    s2.selectByValue("2000");
    driver.findElement(By.xpath("//input[@name='sex'and @value='2']")).click();
    
    try {
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__'and @type]")).sendKeys("ABCD123@gmail.com");
	} catch (Exception e) {
	}
    driver.findElement(By.xpath("//button[contains(text(),'Sign Up')and@name='websubmit']")).click();
	}

}
