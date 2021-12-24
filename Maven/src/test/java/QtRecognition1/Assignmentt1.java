package QtRecognition1;

public class Assignmentt1 {
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import pageObjects.RecentContact;
	import resources.Base;

	public class ConRecent extends Base{
		public WebDriver driver;
		@Test
		public void basepageNav() throws AWTException{
			
	        RecentContact rc = new RecentContact(driver);
	         rc.clickRc().click();
	         rc.Taketab().click();
	    try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
	    rc.Comments().sendKeys("Hard Worker");
	    try {
			Thread.sleep(5000l);
		}
		catch(Exception e){
				e.printStackTrace();
			}
		rc.Submit().click();
		
		//log.info("Recent Contacts Upadted");
		rc.closebtn().click();



		}
		/*@Test
		public void cancelf() throws Exception
		{
			SendKudos s = new SendKudos(driver);
	        s.Cancel().click();
	        try {
				Thread.sleep(5000l);
			}
			catch(Exception e){
					e.printStackTrace();
				}
			driver.close();


		}*/
		
		@BeforeMethod
		public void fin() {
			 RecentContact rc = new RecentContact(driver);
		        rc.Clickusername().sendKeys("pooja.bn@qualitestgroup.com");
		        rc.ClickPassword().sendKeys("P@ssw0rd");
				rc.ClickLogin().click();
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
