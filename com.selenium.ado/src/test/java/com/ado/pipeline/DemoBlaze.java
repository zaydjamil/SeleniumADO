package com.ado.pipeline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamilz\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.demoblaze.com/");
		wd.manage().window().maximize();
		
		wd.findElement(By.linkText("Laptops")).click();
		wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		wd.findElement(By.linkText("Dell i7 8gb")).click();
		wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		wd.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(3000);
		
		wd.switchTo().alert().accept();
		
		wd.close();
	}

}
