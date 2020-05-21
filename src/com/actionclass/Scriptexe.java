package com.actionclass;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scriptexe {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	JavascriptExecutor exe= (JavascriptExecutor)driver;
	
	//exe.executeScript(Window, arg1)
		

	
}	
	
}
