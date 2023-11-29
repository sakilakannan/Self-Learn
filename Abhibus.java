package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//span[text()='Buses']")).click();

	driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	
driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();

driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@data-id='Bangalore']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Today']")).click();

//driver.findElement(By.linkText("Search")).click();
//Thread.sleep(2000);
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//WebElement element = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h5[@class='title'])[1]")));
String businfo = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
System.out.println(businfo);
driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
String Seatinfo = driver.findElement(By.xpath("(//small[text()=' Seats Available'])[1]")).getText();
System.out.println(Seatinfo);
driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
driver.findElement(By.xpath("//span[text()='U12']")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
String seatselect = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
	System.out.println(seatselect);
	String fare = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
	System.out.println(fare);
	String title = driver.getTitle();
	System.out.println(title);
	}
	

}
