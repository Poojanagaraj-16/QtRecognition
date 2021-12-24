package QtRecognition1;

public class Assignmentt4 {

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.SendKudos;
import resources.Base;

public class SendKudosCheck extends Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void LoginFirst() {
		SendKudos s = new SendKudos(driver);
		s.Clickusername().sendKeys("shivangowda.patil@qualitestgroup.com");
	    s.ClickPassword().sendKeys("P@ssw0rd");
		s.ClickLogin().click();
	}
	

   
	
	@Test //Valid
	public void SendKudos() throws AWTException{
		
		SendKudos s = new SendKudos(driver);
        s.SendKudosq().click();
        s.SearchK().sendKeys("shivangowda.patil@qualitestgroup.com");
        try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
    s.Taketab().click();
    try {
		Thread.sleep(2000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
   
    s.Comments().sendKeys("Hard Worker");
    try {
		Thread.sleep(5000l);
	}
	catch(Exception e){
			e.printStackTrace();
		}
	s.Submit().click();
	//log.info("Kudo Sent");
}
	

	
	@BeforeClass
	
	public void findurl() throws Exception {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public void submitt() {
		driver.close();
		

		

	}
	
	
	
   
	
	
	
	
}

}
