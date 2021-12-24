package QtRecognition1;

public class Assignmentt2 {
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import pageObjects.LoginPage;
	import resources.Base;





	public class LoginTC extends Base {
		public WebDriver driver;
		@BeforeTest
		public void intialize() throws IOException
		{
			driver = initializeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		
			
		}
		
		
		
	    @Test(dataProvider = "getData")
		public void basePageNavigation(String Username, String Password) {
			
			LoginPage l = new LoginPage(driver);
	        l.Clickusername().sendKeys(Username);
	        l.ClickPassword().sendKeys(Password);
			l.ClickLogin().click(); 
		   }
	    
	    @AfterTest
	    public void closeatEnd() {
	    	
	    	
	    	  driver.close();
	    }
		
	 @DataProvider

	public Object[][] getData() throws Exception
	{
		Object[][] data = new Object[1][2];
		
		data[0][0] = "pooja.bn@qualitestgroup.com";
		data[0][1] = "P@ssw0rd";
		return data;
	  }
	}



	

}
