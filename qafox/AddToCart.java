package qafox;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	//homepage
	public void homepage(WebDriver driver)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}
	
	//addToCart
	public void addToCart(WebDriver driver)
	{
		driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[3]//button[1]//span[1]")).click();
	}
	// open cart menu
	public void cartMenu(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
	}
	//checkout
	public void checkout(WebDriver driver)
	{
		driver.findElement(By.xpath("//strong[normalize-space()='Checkout']")).click();
	}	
	//enter details
	//fname
		public void fname(WebDriver driver)
		{
			String fname=JOptionPane.showInputDialog("Enter first name");
			driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys(fname);
		}
	//lname
		public void lname(WebDriver driver)
		{
		String lname=JOptionPane.showInputDialog("Enter last name");
		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys(lname);
		}
		//comapny
		public void com(WebDriver driver)
		{
		String com=JOptionPane.showInputDialog("Enter company name");
		driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys(com);
		}
			
		//add
		public void add1(WebDriver driver)
		{
		String add1=JOptionPane.showInputDialog("Enter Address 1");
		driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys(add1);
		}
		
		//add2
		public void add2(WebDriver driver)
		{
		String add2=JOptionPane.showInputDialog("Enter Address 2");
		driver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys(add2);
		}
			
		//city
		public void city(WebDriver driver)
		{
		String city=JOptionPane.showInputDialog("Enter city name");
		driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys(city);
		}
		
		//post code
		public void post(WebDriver driver)
		{
		String post=JOptionPane.showInputDialog("Enter post code");
		driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys(post);
		}
		
		//select country
		public void country(WebDriver driver)
		{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
		s.selectByIndex(9);		}
		
		//select state
		public void state(WebDriver driver)
		{
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
		s1.selectByIndex(1);
		}
			// continue button
	  public void conti(WebDriver driver)
	  {
		  driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
	  }
	  
	  public void comnt(WebDriver driver)
	  {
	    String cmt=JOptionPane.showInputDialog("write comment");
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(cmt);
			  
	  }
	  
	  public void tAndC(WebDriver driver)
	  {
		  driver.findElement(By.xpath("//input[@name='agree']")).click();
	  }
	  
	  public void cont(WebDriver driver)
	  {
		  driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
	  }
	  
}


