package marketing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TermLandingPages {


		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String[] arrData = {
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html",
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html",
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html",
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html",
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html",
					"https://qa.indiacover360.com/Term/Compare-best-term-policy.html"};
			
			
			//The conventional approach of using the for loop
			    System.out.println("Using conventional For Loop:");
			    for(int i=0; i< arrData.length; i++)
			    {
			    	driver.get(arrData[i]);
			    	driver.manage().window().maximize();
			    	Thread.sleep(2000);
			    	
			    	// To Amount type and select
			    	driver.findElement(By.id("userincome")).sendKeys("5 Lacs");
			    	Thread.sleep(3000);
					List<WebElement> options = driver.findElements(By.cssSelector("li.ng-binding.ng-scope"));
					for(WebElement option : options)
					{
						if (option.getText().equals("5 Lacs"))
						{
							option.click(); 
							break;
						}
					}	
			    	
			    driver.close();
			    }

}
}
