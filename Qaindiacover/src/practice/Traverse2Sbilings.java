package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traverse2Sbilings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//getting the text from the given button.. 
		// we started first with to select practice button later on moved to sibling button login 
		System.out.println(driver.findElement(By.xpath("//body/header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		//moving from child to parent and parent to child
		System.out.println(driver.findElement(By.xpath("//body/header/div/button[1]/parent::div/button[2]")).getText());
		
		driver.close();
		
		
	}

}
