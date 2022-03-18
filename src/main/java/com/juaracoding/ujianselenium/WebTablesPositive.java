package com.juaracoding.ujianselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesPositive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement menu_element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div"));
		menu_element.click();
		
		WebElement menu_webtables = driver.findElement(By.id("item-3"));
		menu_webtables.click();
		
		WebElement button_add = driver.findElement(By.id("addNewRecordButton"));
		button_add.click();
		
		driver.switchTo().activeElement().findElement(By.cssSelector("body > div.fade.modal.show > div > div"));
		
		WebElement field_firstName = driver.findElement(By.id("firstName"));
		field_firstName.sendKeys("Siti Husnul");
		
		WebElement field_lastName = driver.findElement(By.id("lastName"));
		field_lastName.sendKeys("Khotimah");
		
		WebElement field_email = driver.findElement(By.id("userEmail"));
		field_email.sendKeys("sitihusnul511@gmail.com");
		
		WebElement field_age = driver.findElement(By.id("age"));
		field_age.sendKeys("26");
		
		WebElement field_salary = driver.findElement(By.id("salary"));
		field_salary.sendKeys("15000000");
		
		WebElement field_department = driver.findElement(By.id("department"));
		field_department.sendKeys("Technology");
		
		WebElement button_submit = driver.findElement(By.id("submit"));
		button_submit.click();

	}

}
