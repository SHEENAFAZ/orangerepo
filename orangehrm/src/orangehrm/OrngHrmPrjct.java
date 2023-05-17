package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrngHrmPrjct {
 
  public static void main(String[] args) throws InterruptedException  {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sheena Fazil\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
   
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
  //Launch URL
      driver.get("http://localhost/orangehrm/orangehrm-5.4/web/index.php/auth/login");
   
  //Login
      driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("Sheena@12345");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
 
  //PIM
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
	
  //Add Employee
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	 
  //Employee Details
	  driver.findElement(By.name("firstName")).sendKeys("Sheena");
	  driver.findElement(By.name("middleName")).sendKeys("A");
	  driver.findElement(By.name("lastName")).sendKeys("Fazil");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("012");
	  
	  Thread.sleep(4000);
	  
  //Save
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
} }

