package DatabaseDemo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {



@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException{

WebDriverManager.chromedriver().setup();

//Set download path 
String downloadPath=System.getProperty("user.dir");

HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

ChromeOptions options=new ChromeOptions();

options.setExperimentalOption("prefs", chromePrefs);




WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

// https:// username:password @ url will handle 


//driver.get("https://admin:admin@the-internet.herokuapp.com/");
//driver.findElement(By.linkText("Basic Auth")).click();


//File Upload Code


driver.get("https://convertio.co/");
driver.findElement(By.cssSelector("label[class='action-label'] span")).click();
Thread.sleep(3000);

Runtime.getRuntime().exec("D:\\AutoIT\\FileUploadAutoITScript.exe");

//Runtime.getRuntime().exec("D:\\AutoIT\\FileUploadAutoITScript.exe");

Thread.sleep(3000);

driver.findElement(By.cssSelector(".convert-button")).click();

driver.findElement(By.xpath("//a[normalize-space()='Download']")).click();
Thread.sleep(3000);

File f = new File(downloadPath + "\\Sample.jpg");
Thread.sleep(3000);
if(f.exists())
{
	
	System.out.println("File Downloaded successfully");
	
	System.out.println("File Downloaded Failed");
}

}



}


