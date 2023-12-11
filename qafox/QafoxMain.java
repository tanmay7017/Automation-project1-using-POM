package qafox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QafoxMain {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Automation\\Browser Extensions\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		QafoxRegistration d=new QafoxRegistration();
		Thread.sleep(2000);
		d.url(driver);
		Thread.sleep(2000);
		d.myAccount(driver);
		d.Register(driver);
		Thread.sleep(2000);
		d.fname(driver);
		d.lname(driver);
		d.email(driver);
		d.telephone(driver);
		Thread.sleep(2000);
		d.password(driver);
		Thread.sleep(2000);
		d.password2(driver);
		d.newsletter(driver);	
		Thread.sleep(2000);
		d.privacyPolicy(driver);
		Thread.sleep(2000);
		d.conti(driver);
		Thread.sleep(4000);
		d.logout(driver);
		Thread.sleep(2000);
		
		
		QafoxLogin q=new QafoxLogin();
		q.login(driver);
		Thread.sleep(2000);
		q.Email(driver);
		Thread.sleep(1000);
		q.pass(driver);
		Thread.sleep(1000);
		q.log(driver);
		Thread.sleep(2000);
		
		AddToCart a=new AddToCart();
		a.homepage(driver);
		Thread.sleep(2000);
		a.addToCart(driver);
		Thread.sleep(2000);
		a.cartMenu(driver);
		Thread.sleep(2000);
		a.checkout(driver);
		Thread.sleep(2000);
		a.fname(driver);
		a.lname(driver);
		a.com(driver);
		a.add1(driver);
		a.add2(driver);
		a.city(driver);
		a.post(driver);
		Thread.sleep(2000);
		a.country(driver);
		Thread.sleep(2000);
		a.state(driver);
		Thread.sleep(2000);
		a.conti(driver);
		Thread.sleep(2000);
		a.comnt(driver);
		a.tAndC(driver);
		Thread.sleep(2000);
		a.cont(driver);
		Thread.sleep(2000);
		
		HomepageMenus h=new HomepageMenus();
		h.home(driver);
		Thread.sleep(2000);
		h.tablets(driver);
		Thread.sleep(2000);
		h.soft(driver);
		Thread.sleep(2000);
		h.phAndPD(driver);
		Thread.sleep(2000);
		h.camera(driver);
		Thread.sleep(2000);
		
		MyAccount m=new MyAccount();
		m.home1(driver);
		Thread.sleep(2000);
		m.list(driver);
		Thread.sleep(2000);
		m.acc(driver);
		Thread.sleep(2000);
		m.edit(driver);
		Thread.sleep(2000);
		m.fname(driver);
		m.lname(driver);
		m.email(driver);
		m.telephone(driver);
		m.cont(driver);
		Thread.sleep(2000);
		m.pass(driver);
		Thread.sleep(2000);
		m.pwd(driver);
		m.pwd2(driver);
		Thread.sleep(2000);
		m.cont2(driver);
		Thread.sleep(2000);
		m.logout(driver);
		Thread.sleep(2000);
		m.home1(driver);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
