package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Sindu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Asokan");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Welcome@123");
		
		WebElement dateDD=driver.findElement(By.name("birthday_day"));
		Select sec=new Select(dateDD);
		sec.selectByIndex(21);
		
		WebElement monthdd=driver.findElement(By.id("month"));
		Select sec1=new Select(monthdd);
		sec1.selectByValue("2");
		
		WebElement yeardd=driver.findElement(By.id("year"));
		Select sec2=new Select(yeardd);
		sec2.selectByVisibleText("1994");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
	}

}
