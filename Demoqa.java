package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class Demoqa {
	
	public static void main(String[] args) {
		System.setProperty("WebDriver chrome.driver", "D:\\selenium");
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().window().maximize();
		JavascriptExecutor jd=(JavascriptExecutor)d;
		jd.executeScript("window.scrollBy(0,400)");
		WebElement name=d.findElement(By.id("firstName"));
		name.sendKeys("mogana");
		d.findElement(By.id("lastName")).sendKeys("priya");
		d.findElement(By.id("userEmail")).sendKeys("priya12@gmail.com");
		d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		d.findElement(By.id("userNumber")).sendKeys("9786475651");
	d.findElement(By.id("dateOfBirthInput")).click();
	d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[105]")).click();
	d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]")).click();
	d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[5]")).click();
		WebElement sub=d.findElement(By.id("subjectsInput"));
		sub.sendKeys("Maths");
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("english");
		sub.sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		d.findElement(By.id("currentAddress")).sendKeys("943,gandhinagar 3rd street");
		WebElement pic =d.findElement(By.id("uploadPicture"));
		pic.sendKeys("C:\\Users\\ADMIN\\Pictures\\");
		WebElement state=d.findElement(By.id("react-select-3-input"));
		state.sendKeys("Haryana");
		Actions a=new Actions(d);
		state.sendKeys(Keys.ENTER);
		WebElement city =d.findElement(By.id("react-select-4-input"));
		city.sendKeys("panipat");
		a.sendKeys(Keys.ENTER).perform();
		jd.executeScript("window.scrollBy(0,400)");
		d.findElement(By.id("submit")).submit();
	
	}

	}
