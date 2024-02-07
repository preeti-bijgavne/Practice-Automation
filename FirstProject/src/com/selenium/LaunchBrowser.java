package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	static WebDriver driver;

	public static void main(String[] args) {

		launchBrowser();
		login();

	}

	public static void launchBrowser() {
		driver = new ChromeDriver();
		

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	public static void login() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));
		password.sendKeys("admin123");
		
		WebElement loginButton =  driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

	}

}
