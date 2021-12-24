package QtRecognition1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import QtRecognition.Assessment;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentt {
	public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		Assessment assessment = new Assessment();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		assessment.driver = driver;
		driver.manage().window().maximize();
		
		driver.get("https://qtrecognition.testqtwiz.com/");
		driver.findElement(By.name("username")).sendKeys("pooja.bn@qualitestgroup.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("P@ssw0rd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "QTRecognition");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='shoutout_to_me']//i[1]"));
		for (WebElement colors : ele) {
			String color = colors.getCssValue("color");
			
			if(color.equals("rgb(254, 204, 22)"))
			{
				System.out.println("Gold is present");
			}
			else if (color.equals("rgb(42, 37, 89)")) 
			{
				System.out.println("Navy is present");
			}
			else if (color.equals("rgb(147, 149, 152)")) 
			{
				System.out.println("white is present");
			}
			
		}
		
		
		


}
