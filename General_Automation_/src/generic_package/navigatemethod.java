package generic_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		driver.findElement(By.xpath("//a[@href='vacation.html']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.quit();
	}

}
