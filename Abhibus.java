package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.abhibus.com//");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Bus']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		driver.findElement(By.id("search-button")).click();
		String busname = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
		System.out.println(busname);

		driver.findElement(By.xpath("//span[text()='Sleeper']/parent::a")).click();
		//String seatavail=driver.findElement(By.xpath("//div[@id='seat-availability-info']")).getText();
		//System.out.println(seatavail);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		//driver.findElement(By.xpath("//span[text()='DL10']")).click();
		
		driver.findElement(By.xpath("//div[@id='place-container']//input")).click();
		driver.findElement(By.xpath("//div[@id='place-container']//input")).click();
		String text = driver.findElement(By.xpath("//div[@class='row selectedSeatDetails']")).getText();
		System.out.println(text);
		String title=driver.getTitle();
		System.out.println(title);
		
		


	}

}
