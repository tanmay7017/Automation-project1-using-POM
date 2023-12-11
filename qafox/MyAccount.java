package qafox;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
	public void home1(WebDriver driver)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}
	//List
	public void list(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	}
	
	public void acc(WebDriver driver)
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")).click();
	}
	
	public void edit(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Edit Account']")).click();
		
	}
	
	//fname
		public void fname(WebDriver driver)
		{
			String fname=JOptionPane.showInputDialog("Enter first name");
			driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fname);
		}
		//lname
		public void lname(WebDriver driver)
		{
			String lname=JOptionPane.showInputDialog("Enter last name");
			driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lname);
		}
		
		//email
		public void email(WebDriver driver)
		{
			String email=JOptionPane.showInputDialog("Enter email id");
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		}
		
		//telephone
		public void telephone(WebDriver driver)
		{
			String tel=JOptionPane.showInputDialog("Enter phone number");
			driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(tel);
		}
		
		public void cont(WebDriver driver)
		{
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
		}
		
		public void pass(WebDriver driver)
		{
			driver.findElement(By.xpath("//a[normalize-space()='Password']")).click();
		}
		
		//new pass
				public void pwd(WebDriver driver)
				{
					String pwd=JOptionPane.showInputDialog("Enter new password");
					driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
				}
				
				//confirm pass
				public void pwd2(WebDriver driver)
				{
					String pwd2=JOptionPane.showInputDialog("Enter phone number");
					driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(pwd2);
				}
				
				public void cont2(WebDriver driver)
				{
					driver.findElement(By.xpath("//input[@value='Continue']")).click();
				}
				public void logout(WebDriver driver)
				{
					driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();

				}
				
				
		
		
}
