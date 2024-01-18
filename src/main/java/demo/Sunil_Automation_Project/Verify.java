package demo.Sunil_Automation_Project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Verify {

	public static <Webelement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//		
//		driver.manage().window().maximize();
//		
//		WebElement us=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//		us.sendKeys("zyz");
//		
//		WebElement pd= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//		pd.sendKeys("admin123");
//		
//		
//		WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//		loginButton.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement invalid=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
//		
//		String Actual="Invalid credentials";		
//		String Expected=invalid.getText();
//		
//		Assert.assertEquals(Expected, Actual);
//		System.out.println("invalid login");
//		driver.close();
//	
		
//		partial link and linktext locators
		
	
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().fullscreen();
//		 
//		Thread.sleep(3000);
////		WebElement jk=driver.findElement(By.partialLinkText("Use Cust"));
////		jk.click();
//		
//		driver.findElement(By.linkText("Forgot Your Password?")).click();
//		Thread.sleep(3000);
//		driver.close();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		Thread.sleep(3000);
//		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
//		System.out.println(iframeElements.size());
//	
////		driver.switchTo().frame("iframe-name");
//		
////		Thread.sleep(3000);
////		driver.quit();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
	WebElement element = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
Select select = new Select(element);
List<WebElement> list = select.getOptions();
for(int i=0; i<list.size();i++)
{System.out.println(list.get(i).getText());
	}
	}
		}

