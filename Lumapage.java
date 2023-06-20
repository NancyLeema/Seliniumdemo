package seliniumproject1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


public class Lumapage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[3]/a[1]\r\n")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nancy Leema");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Karunakaran");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nancyleema.k0911@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tharun@0911");
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("Tharun@0911");
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nancyleema.k0911@gmail.com");
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Tharun@0911");
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")).click();
		WebElement textElement=driver.findElement(By.xpath(" //header/div[1]/div[1]/ul[1]/li[1]/span[1]"));
		String text = textElement.getText();
		System.out.println("Value:Welcome, Nancy Leema Karunakaran! " + text);
		File firstSrc= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		FileHandler.copy(firstSrc, dest);
	
		driver.quit();
		
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
