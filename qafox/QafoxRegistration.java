package qafox;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QafoxRegistration {
	// open url
	public void url(WebDriver driver)
	{	
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	//click My account
	public void myAccount(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	}
	
	//For Registration
	//click Register
	public void Register(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
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
	
	//password
	public void password(WebDriver driver)
	{
		String pass=JOptionPane.showInputDialog("Enter pass");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
	}
	
	//confirm password
		public void password2(WebDriver driver)
		{
			String pass2=JOptionPane.showInputDialog("Confirm pass");
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(pass2);
		}
		// newsletter
	public void newsletter(WebDriver driver)
	{
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
	}
	//privacy policy
	public void privacyPolicy(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	//continue
	public void conti(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	
	public void logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
	}
	
}
