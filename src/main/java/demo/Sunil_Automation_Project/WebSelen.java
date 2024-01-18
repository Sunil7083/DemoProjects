package demo.Sunil_Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSelen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
//		5-1-2024
		
		/*	WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().fullscreen();

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("SUNIL");

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Password");

        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();*/
		
		
	
		/*        WebElement search1= driver.findElement(By.className("ytp-time-clip-icon"));
        search1.click();
        
	driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		s
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		
		driver.close();
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to("https://www.myntra.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/

//		8-1-2024
	
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("kaise hua");
        
        WebElement searchicon=driver.findElement(By.id("search-icon-legacy"));
        searchicon.click();

        driver.get("https://www.youtube.com/watch?v=WWXm39leYew");
        Thread.sleep(2000);
        
        WebElement fullscreen=driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[35]/div[2]/div[2]/button[9]"));
        fullscreen.click();
  
        Thread.sleep(9000);
		driver.close();
		
	}

}
