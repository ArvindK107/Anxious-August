package com.task.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Selenium-workspace\\Task\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
	Actions a = new Actions(driver);
	a.click(fashion).build().perform();
	WebElement men = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3]"));
	Actions b = new Actions(driver);
	b.click(men).build().perform();
	
	
	
	
	
	
}
}
