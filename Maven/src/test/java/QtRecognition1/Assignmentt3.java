package QtRecognition1;

public class Assignmentt3 {

	import java.awt.AWTException;
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;

	import pageObjects.SearchKudos;
	import pageObjects.SendKudos;
	import resources.Base;

	public class SearchCheck extends Base{
		public WebDriver driver;
		
		@Test
		public void Searchkudoss() throws IOException, AWTException{
			driver = initializeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
	        SearchKudos sc = new SearchKudos(driver);
	        sc.Clickusername().sendKeys("pooja.bn@qualitestgroup.com");
	        sc.ClickPassword().sendKeys("P@ssw0rd");
			sc.ClickLogin().click();
	        sc.kudoss().click();


			try {
				Thread.sleep(5000l);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			sc.kudSearch().sendKeys("pooja.bn@qualitestgroup.com");
			try {
				Thread.sleep(5000l);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			sc.searchbtn().click();

	        driver.close();

			
		}	
		


	}

}
