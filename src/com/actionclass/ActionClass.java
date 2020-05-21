package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	
	@Test()
	public void actions() throws InterruptedException
	{
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	///html/body/div[2]/div/div/button
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	
	
	//driver.switchTo().alert().dismiss();
	
	Actions act= new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/span"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/ul/li/ul/li[2]/ul/li[10]/a")).click();
	
	
	
	
	}
	
	

}
