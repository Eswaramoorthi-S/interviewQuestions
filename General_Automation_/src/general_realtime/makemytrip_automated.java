package general_realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip_automated {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    driver.findElement(By.xpath("//span[@class='commonModal__close'and @data-cy]")).click();
    driver.findElement(By.cssSelector("a[href=\"https://www.makemytrip.com/bus-tickets/\"]")).click();
    driver.findElement(By.xpath("//label[@for='fromCity']")).click();
    //driver.findElement(By.xpath("//input[@placeholder='From'and@title='From']")).sendKeys("chennai");
    driver.findElement(By.id("travelDate")).click();
    driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[9]")).click();     
	}

}
