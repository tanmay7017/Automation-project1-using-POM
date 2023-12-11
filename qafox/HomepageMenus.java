package qafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageMenus {
	
	public void home(WebDriver driver)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}
	//tablets
	public void tablets(WebDriver driver)
	{
		  driver.findElement(By.xpath("//a[normalize-space()='Tablets']")).click();
	}
	//softwares
	public void soft(WebDriver driver)
	{
		  driver.findElement(By.xpath("//a[normalize-space()='Software']")).click();
	}
	//phone and pdas
	public void phAndPD(WebDriver driver)
	{
		  driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']")).click();
	}
	//cameras
	public void camera(WebDriver driver)
	{
		  driver.findElement(By.xpath("//a[normalize-space()='Cameras']")).click();
	}
	

}
