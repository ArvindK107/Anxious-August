package com.task.in;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TaskAuto {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Selenium-workspace\\Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("automationpractice");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement link = driver.findElement(By.xpath("//h3[text()='Automation Practice']"));
		Actions a = new Actions(driver);
		a.click(link).build().perform();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		Actions b = new Actions(driver);
		b.click(signin).build().perform();
		Thread.sleep(5000);

		WebElement mail = driver.findElement(By.name("email_create"));
		mail.sendKeys("kumararavind@gmail.com");
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		Thread.sleep(3000);
		WebElement mr = driver.findElement(By.name("id_gender"));
		mr.click();
		WebElement fn = driver.findElement(By.id("customer_firstname"));
		fn.sendKeys("Arjun");
		WebElement ln = driver.findElement(By.name("customer_lastname"));
		ln.sendKeys("Kumar");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("a1a2a3a124...");
		WebElement days = driver.findElement(By.id("days"));
		Select s = new Select(days);
		s.selectByValue("19");
		WebElement months = driver.findElement(By.name("months"));
		Select s1 = new Select(months);
		s1.selectByVisibleText("June ");
		WebElement years = driver.findElement(By.id("years"));
		Select s2 = new Select(years);
		s2.selectByValue("1992");
		WebElement comp = driver.findElement(By.id("company"));
		comp.sendKeys("Srinsoft Technologies");
		WebElement addr = driver.findElement(By.name("address1"));
		addr.sendKeys("19,8th street,as nagar,10001");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Newyork city");
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("32");
		WebElement pc = driver.findElement(By.name("postcode"));
		pc.sendKeys("10001");
		WebElement addi = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		addi.sendKeys("9840878861");
		WebElement home = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
		home.sendKeys("8056010943");
		WebElement mob = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
		mob.sendKeys("8056010941");
		WebElement addre = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
		addre.sendKeys("sweden");
		
		WebElement regi = driver.findElement(By.name("submitAccount"));
		regi.click();
		driver.close();
		
	}
}
