package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");	
		//driver.findElement(By.name("j_idt88:j_idt90")).click();
		//driver.close();
		System.out.println(driver.findElement(By.name("j_idt88:j_idt92")).isEnabled());
		System.out.println(driver.findElement(By.name("j_idt88:j_idt98")).getSize());
		//System.out.println(driver.findElement(By.name("j_idt88:j_idt96")).getCssValue(null);
		
		
	}
	
	

}
