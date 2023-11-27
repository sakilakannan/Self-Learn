package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("searchVal"));
      search.sendKeys("bags");
     driver.findElement(By.className("ic-search")).click();
     driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[3]")).click();
     WebElement element = driver.findElement(By.xpath("//div[@class='facet-linkhead' and input[@type='checkbox' and @id='Men - Fashion Bags']]"));

  // Perform some actions that might trigger a page refresh or content update

  try {
      element.click();
  } catch (StaleElementReferenceException e) {
      // Re-locate the element
      element = driver.findElement(By.xpath("//div[@class='facet-linkhead' and input[@type='checkbox' and @id='Men - Fashion Bags']]"));
      element.click();
      driver.navigate().refresh();
      
  }
  WebElement lengthElement = driver.findElement(By.xpath("//div[@class='length']/strong"));
  String itemsFoundText = lengthElement.getText();
  System.out.println("Items Found: " + itemsFoundText);
  List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));

  for (WebElement brandElement : brandElements) {
      String brandText = brandElement.getText();
      System.out.println("Brand: " + brandText);
  }
  List<WebElement> bagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
  for (WebElement bagname : bagnames) {
	  String bagnameText=bagname.getText();
	  System.out.println("Bag Name: "+bagnameText);
	
}
  


	}

}
