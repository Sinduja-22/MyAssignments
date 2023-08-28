package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}

}
