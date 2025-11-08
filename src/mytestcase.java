import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytestcase {

	
	WebDriver driver= new ChromeDriver();
	Random rand=new Random();
	
	 String FirstName;
	 String LastName;
	String Password;
	
	
	@BeforeTest
	public void startup() {
		driver.get("https://smartbuy-me.com/ar?gad_source=1&gad_campaignid=21849021241&gbraid=0AAAAABNN1QMVr2YTs_IoA8RSTbPH_q49N&gclid=CjwKCAiA8bvIBhBJEiwAu5ayrNBlHFflbRJn1I6_ne84LW5O7FwQVlhAB-9SDwD4g7RP9yYNTq0BahoCug8QAvD_BwE");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	
	public void Signup()  {
		
		int RandomNum=rand.nextInt(7000);
		driver.navigate().to("https://smartbuy-me.com/ar/account/register");	
		WebElement FirstNameInput=driver.findElement(By.id("customer[first_name]"));
		WebElement LastNameInput=driver.findElement(By.id("customer[last_name]"));
		WebElement EmailInput=driver.findElement(By.id("customer[email]"));
		WebElement PasswordInput=driver.findElement(By.id("customer[password]"));
		WebElement Button=driver.findElement(By.className("form__submit"));
		
		String Name[]= {"dareen","zaina","leen"};
		int  randomindex=rand.nextInt(Name.length);
	    String RandomName=Name[randomindex];
	    
	    String LName[]={"ahmad","abdallah","mohammad"};
	    String 	RandomLastName=LName[rand.nextInt(LName.length)];
	    
	     FirstName=RandomName;
	     LastName=RandomLastName;
	    String Email=FirstName+LastName+RandomNum+"@gmail.com";
	     Password="Abcd@test";
	    
	    FirstNameInput.sendKeys(FirstName);
	    LastNameInput.sendKeys(LastName);
	    EmailInput.sendKeys(Email);
	    PasswordInput.sendKeys(Password);
	    Button.click();
	    
	    
	    
		
		
		
	}
	
	
}
