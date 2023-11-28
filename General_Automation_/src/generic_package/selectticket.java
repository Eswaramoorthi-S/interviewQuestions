package generic_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectticket {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-inline' and@name='fromPort']"));
		Select s=new Select(ele);
		s.selectByValue("Mexico City");
		WebElement ele1 = driver.findElement(By.xpath("//select[@class='form-inline' and@name='toPort']"));
		Select s1=new Select(ele1);
		s1.selectByValue("London");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("(//input[@class='btn btn-small'and @type='submit' ])[3]")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		String id = driver.findElement(By.xpath("(//td['Id']/../td[2])[1]")).getText();
		System.out.println("the ticket id is="+id);
		driver.close();
	}

}
