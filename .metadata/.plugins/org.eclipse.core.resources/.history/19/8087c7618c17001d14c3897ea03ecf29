package motor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarProposalComprehensive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://qa.indiacover360.com/Application/Car?CPID=NzgzNTk");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("md-radio-button[id='radio_0'] div[class='_md-off']")).click();
		//driver.findElement(By.xpath("//md-checkbox[contains(@class,'nooutline md-primary checkbtncaraddon ng-pristine ng-valid ng-scope md-default-theme ng-touched')]//div[contains(@class,'_md-label')]")).click();
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("window.scrollBy(0,500)");
	      
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[5]/md-card[1]/md-card-content[1]/div[1]/div[3]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[3]/md-card[1]/md-card-content[1]/div[1]/div[3]/div[1]/button[1]")).click();
	      Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[11]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[5]/md-card[1]/md-card-content[1]/div[1]/div[3]/div[1]/button[1]/span[1]/span[1]/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//md-radio-button[@id='radio_72']//div[contains(@class,'_md-off')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ng-scope[ng-show='!$parent.showbtnloadermotor']")).click();
		Thread.sleep(15000);
		
		//Please confirm your details
	
		driver.findElement(By.xpath("//input[contains(@class,'input-field-textareaTerms ng-pristine ng-valid ng-valid-minlength ng-valid-maxlength ng-touched')]")).sendKeys("SATISH KUMAR");
		driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-12 col-xs-12 tbmrg1']//input[@type='email']")).sendKeys("satish.insurejoy@gmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'col-md-6 col-sm-8 col-xs-12 col-xxs-12 pop-pro-lead-row nopad')]//button[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
