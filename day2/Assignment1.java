package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sinduja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Asokan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sindu");
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		driver.findElement(By.name("description")).sendKeys("Create Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sindujasasirose@gmail.com");
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sec= new Select(stateDD);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Sample");
		driver.findElement(By.name("submitButton")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
				
		
		
		
		
		
		
	}

}
