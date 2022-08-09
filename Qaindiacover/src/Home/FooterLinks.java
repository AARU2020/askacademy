package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.insurejoy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement opentab =  driver.findElement(By.xpath("//body/div[2]/div[1]/footer[1]/div[1]/div[1]/div[3]"));
		System.out.println(opentab.findElements(By.tagName("a")).size());
		for(int i=1;i<opentab.findElements(By.tagName("a")).size();i++)
		{
			String opentabsagain=Keys.chord(Keys.CONTROL, Keys.ENTER);
			opentab.findElement(By.tagName("a")).sendKeys(opentabsagain);
			i++;
		}
		
		
		
		driver.close();
		

	}

}
