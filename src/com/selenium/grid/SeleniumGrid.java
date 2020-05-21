package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid {

DesiredCapabilities cap=null;
@Parameters("browser")
@Test
public void gridMethod(String br) throws MalformedURLException
{
	if(br.equalsIgnoreCase("firefox"))
	{
	cap=new DesiredCapabilities();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.WINDOWS);
	}
	
	else if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vilaskar\\Desktop\\chromedriver.exe");
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		
	}
	RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	
	//driver.get("http://183.82.100.55/ranford2");
	driver.get("http://183.82.100.55/ranford2");
	driver.manage().window().maximize();
	
	
	String expectedValue="Ranford Bank";
	String actualValue=driver.findElement(By.xpath("//*[@id=\"Form1\"]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	if(expectedValue.equals(actualValue))
	{
		System.out.println("Ranford Home Page Successfully displayed");
	}
	else
	{
		System.out.println("Ranford Home Page not Successfully displayed");
	}
	
	//Creating a branch
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("M1ndq");	
	driver.findElement(By.id("login")).click();

	 expectedValue= "Welcome to Admin";
	actualValue=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	if(expectedValue.equals(actualValue))
	{
		System.out.println("Admin Home Page Successfully displayed");
	}
	else
	{
		System.out.println("Admin Home Page not Successfully displayed");
	}

	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	driver.findElement(By.id("txtbName")).sendKeys("allahabadbank12345678");		
	driver.findElement(By.id("txtAdd1")).sendKeys("gayathri");
	driver.findElement(By.id("Txtadd2")).sendKeys("nagar");
	driver.findElement(By.id("txtadd3")).sendKeys("moulaali");
	driver.findElement(By.id("txtArea")).sendKeys("malkajgiri");
	driver.findElement(By.id("txtZip")).sendKeys("12345");
	
	
	//Selecting value from drop down for country
	
	Select country= new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByValue("INDIA");
	

	//Selecting value from drop down for state
	
	Select state= new Select(driver.findElement(By.id("lst_stateI")));
	state.selectByValue("Andhra Pradesh");
	

	//Selecting value from drop down for city
	
	Select city= new Select(driver.findElement(By.id("lst_cityI")));
	city.selectByValue("Hyderabad");
	
	driver.findElement(By.id("btn_insert")).click();

	expectedValue="Sucessfully";
	actualValue=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	if(actualValue.contains(expectedValue))
	{
		System.out.println("Branch Successfully created");
	}
	else {
		System.out.println("Branch already exists");
	}
	
	driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();

}

	
	
}
