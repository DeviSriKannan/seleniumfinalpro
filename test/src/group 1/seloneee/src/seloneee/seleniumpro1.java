package seloneee;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpro1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/public/expedia/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//sending text in search box
WebElement element = driver.findElement(By.xpath("//*[@id=\'citiesInput\']"));
		
		if ((element).isDisplayed())
		{
			System.out.println("Text box is displayed ");

			element.sendKeys("Hilton");	
			
		}
		else
		{
			System.out.println("Test case failed : Search box not found");
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List <WebElement> listItems = driver.findElements(By.cssSelector("#eac-container-citiesInput > ul"));
		listItems.get(0).click();
		Thread.sleep(1500);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dpean1\"]/div/input"));
		//check in box 
		if ((element1).isDisplayed())
		{
			System.out.println("CheckIn Box is displayed ");

			element1.click();	
			
		}
		else
		{
			System.out.println("Test case failed : CheckIn box  not found");
		}
		Thread.sleep(1500);
WebElement element2 = driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-days > table > tbody > tr:nth-child(4) > td:nth-child(6)"));
		
		//checkout box
		if ((element2).isDisplayed())
		{
			System.out.println("CheckOut Box is displayed ");

			element2.click();	
			
		}
		else
		{
			System.out.println("Test case failed : CheckOut box  not found");
		}
		Thread.sleep(1500);
		WebElement element3 = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[7]"));
		element3.click();
		Thread.sleep(1500);
		WebElement element4 = driver.findElement(By.xpath("//*[@id='properties']/form/div[5]/button"));
		//search button
		if ((element4).isDisplayed())
		{
			System.out.println("Search Button is displayed ");

			element4.click();	
			
		}
		else
		{
			System.out.println("Test case failed : Search button  not found");
		}
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div/h1"));
		
		//Result page
		if ((element5).isDisplayed())
	{
		System.out.println("Test failed : No Results Found");
	}
	else
	{
		System.out.println("Test passed");
	}
		driver.close();
		
		
	}

}
