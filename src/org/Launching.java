
package org;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launching {
	
public static void main(String[] args) {
	
	Date d=new Date();
	
	System.out.println(d);
	
	SimpleDateFormat s=new SimpleDateFormat("dd-mm-yy");
	String n = s.format(d);
	System.out.println(n);


	System.out.println("Hello world");
	
	System.out.println("Java class");
	
	WebDriver driver=new ChromeDriver();
	Actions ac=new Actions(driver);
	WebElement a=driver.findElement(By.id("email"));
	ac.moveToElement(a);
	
	
}
}