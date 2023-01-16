package propack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Abc {
	@Test
	public  void orangehrm()
	{
		System.out.println("hello ....... webpage launching with firefox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA\\Downloads\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/orangehrm/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Stc@1234");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("krishna");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys("U");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("002");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
				}
	

}


