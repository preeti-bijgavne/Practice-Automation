package kingvest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		login();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://kingvest.co/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement signUp = driver.findElement(By.linkText("SIGN IN"));
		signUp.click();
		

	}

	public static void login() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ranjeetj.synsoft+r04@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ranjeetj.synsoft+r04@gmail.com");
		WebElement login =driver.findElement(By.xpath("//button[@name='action']"));
		login.click();
	}
}
