package qafox;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QafoxLogin {
	// open login page
	public void login(WebDriver driver)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	//Enter Email id
	public void Email(WebDriver driver)
	{
		String emailid=JOptionPane.showInputDialog("Enter email id");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(emailid);
	}
	// Enter Pasword
	public void pass(WebDriver driver)
	{
		String pwd=JOptionPane.showInputDialog("Enter password");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	}
	// click log in
	public void log(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	
}
