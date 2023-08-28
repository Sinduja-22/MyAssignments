package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		//Below are the advanced Xpath which are correct
		//driver.findElement(By.xpath("//form[@class='css-19j7d8y']")/input);
		//driver.findElement(By.xpath("//input[@class='css-1upamjb']")/parent::form)
	}

}
