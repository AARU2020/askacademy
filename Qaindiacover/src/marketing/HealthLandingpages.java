package marketing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthLandingpages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] arrData = {"https://qa.indiacover360.com/Health/compare-maternity-insurance-plans.html",
				"https://qa.indiacover360.com/Health/best-maternity-insurance-plans-calculator.html",
				"https://qa.indiacover360.com/Health/maternity-cover-insurance-plans.html",
				"https://qa.indiacover360.com/Health/compare-pregnancy-insurance-plans.html",
				"https://qa.indiacover360.com/Health/best-pregnancy-insurance-calculator.html",
				"https://qa.indiacover360.com/Health/top-pregnancy-insurance-plans.html",
				"https://qa.indiacover360.com/Health/compare-Family-health-insurance-plans.html",
				"https://qa.indiacover360.com/Health/best-family-health-insurance-plans.html",
				"https://qa.indiacover360.com/Health/best-family-health-insurance-calculator.html",
				"https://qa.indiacover360.com/Health/compare-critical-illness-health-insurance-plans.html"};
		//The conventional approach of using the for loop
		    System.out.println("Using conventional For Loop:");
		    for(int i=0; i< arrData.length; i++){
		    	driver.get(arrData[i]);
		    	driver.manage().window().maximize();
		    	Thread.sleep(2000);
		    	driver.findElement(By.id("Tel2")).sendKeys("36");
		    	
		    	
		    	driver.findElement(By.id("usercity")).sendKeys("Hyd");
				List<WebElement> options = driver.findElements(By.cssSelector("li.ng-binding.ng-scope"));
				for(WebElement option : options)
				{
					if (option.getText().equals("Hyderabad, Andhra Pradesh"))
					{
						option.click(); 
						break;
					}
				}
				driver.findElement(By.id("txtMobileNumber")).sendKeys("6789678967");
				driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[5]/button[1]")).click();
				Thread.sleep(5000);
				
			/*	String myWindowHandle = driver.getWindowHandle();
		 		driver.switchTo().window(myWindowHandle);*/
		 		
				/*driver.findElement(By.xpath("//input[@id='Tel4']")).sendKeys("14");
				driver.findElement(By.xpath("//input[@id='Tel5']")).sendKeys("01");
				driver.findElement(By.xpath("//input[@id='Tel6']")).sendKeys("1986");
				driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[9]/button[1]")).click();
				Thread.sleep(5000);*/
		      //System.out.println(arrData[i]);
				System.out.println(driver.getCurrentUrl());
		    }  

	    	driver.close();
	
	}

}
