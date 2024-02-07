package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebooksignup {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchbrowser();
		createNewAccount();
		captureScreenshot();

	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
		}

	public static void createNewAccount() {

		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Preeti");

		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("QA");
		
		WebElement emailOrnumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailOrnumber.sendKeys("preetiqa07@gmail.com");
		
		WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmEmail.sendKeys("preetiqa07@gmail.com");
		
		WebElement newPassword = driver.findElement(By.id("password_step_input"));
		newPassword.sendKeys("Teqast@123");
		
		WebElement birthDay = driver.findElement(By.id("day"));
		birthDay.sendKeys("5");
		
		WebElement birthMonth =driver.findElement(By.id("month"));
		birthMonth.sendKeys("May");
		
		WebElement birthYear = driver.findElement(By.id("year"));
		birthYear.sendKeys("2005");
		
		WebElement genderButton =driver.findElement(By.xpath("//input[@value='1']"));
		genderButton.click();

		WebElement signUp =driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUp.click();
		
		}
	public static void captureScreenshot() throws Exception {
		TakesScreenshot screenshot = 	((TakesScreenshot)driver);
		File sourceFile = 	screenshot.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(sourceFile, new File("C:\\Users\\ADMIN\\eclipse-workspace\\screenshot\\test1.png"));
	}
}
