package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hdfc {
	
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		//driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();
	
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[3]/div/div[3]/div/div/button")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[1]")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
	
	///html/body/div[4]/div[2]/div[1]/a
	driver.switchTo().frame("login_page");
	driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("123456789");
	
	
	
	
	}

}
