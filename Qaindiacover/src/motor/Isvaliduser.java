package motor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Isvaliduser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.insurejoy.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("exampleInputEmail")).sendKeys("amitflm@insurejoy.com");
		driver.findElement(By.id("exampleInputPassword")).sendKeys("Insurejoy@123");
		driver.findElement(By.xpath("//button[contains(text(),\"Let's Go\")]")).click();
		//System.out.println(driver.findElement(By.xpath("//span[@class='mr-2 d-none d-lg-inline small']")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//span[@class='mr-2 d-none d-lg-inline small']")).getText(), "Name :amityadav FLM");
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-mainpage[1]/footer[1]/div[1]/div[1]/div[1]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-mainpage[1]/footer[1]/div[1]/div[1]/div[1]")).getText(), " For queries ");
		

		driver.quit();
	}

}
