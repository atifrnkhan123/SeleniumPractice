//Automation assignment of automationpractice
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenWebSite
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
//		System.setProperty("webdriver.chrome.driver", "Users/atif.khan/Downloads/Seleniumchromedriver/chromedriver");
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("admin@xyz.com");
		driver.findElement(By.id("passwd")).sendKeys("admin@123");
		driver.findElement(By.id("SubmitLogin")).click();
//		driver.findElement(By.className("sf-menu clearfix menu-content sf-js-enabled sf-arrows")).click();
//		action.moveToElement(driver.findElement(By.xpath("(//a[@title=\"Dresses\" and @class=\"sf-with-ul\"])[1]"))).perform();

		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//a[@title=\"Dresses\" and @class=\"sf-with-ul\"])[1]")));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//a[@title=\"Casual Dresses\"])[1]")));
		driver.findElement(By.id("layered_id_attribute_group_1")).click();
		driver.findElement(By.id("selectProductSort")).click();
		driver.findElement(By.xpath("//option[@value='price:asc']")).click();
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//a[@title=\"Casual Dresses\"])[1]")));
//        driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='7']")).click();	
        WebElement ele = driver.findElement(By.xpath("//h5//a[@title='Printed Chiffon Dress']"));	
        
//        Actions action= new Actions(driver);		
        action.moveToElement(ele).perform();	
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='7']")).click();	
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click(); 
		driver.close(); //closes the browser
		//Automation assignment of automationpractice





	}
}
