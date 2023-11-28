package generic_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tocheckthetitle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://blazedemo.com/index.php");	
	    WebElement ele = driver.findElement(By.xpath("//a[@href='vacation.html']"));
	    boolean res=ele.isDisplayed();
	    		if(res) {
	    			System.out.println("title is displayed");
	    		}
	    		else
	    		{
	    			System.out.println("title is not displayed");
	    		}
	    		driver.close();
	     
	    
	    
	}}