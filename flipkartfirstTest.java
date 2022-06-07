package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class flipkartfirstTest {

	public static void main(String[] args)  {
		
	    System.setProperty("webdriver.gecko.driver","C://Users//mounika//eclipse//geckodriver//geckodriver.exe");
	    
	    //FirefoxOptions options=new FirefoxOptions();
		//options.addArguments("--incognito");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://codeshare.io/");
		driver.findElement(By.xpath("/html/body/div[1]/div/section[1]/div/div[1]/p[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/textarea")).sendKeys("#include <stdio.h>");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/textarea")).sendKeys("#include <conio.h");
		
		/*driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("dell");
	    driver.findElement(By.cssSelector(".L0Z3Pu > svg:nth-child(1)")).click();  */

	}

}
