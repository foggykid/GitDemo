import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser opened.");
		String URL = "http://www.google.com";
		driver.get(URL);
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Test Pass");
		}
		else {
		System.out.println("Test Fail");
	}
System.out.println("new development made after importing the code from GitX");
System.out.println("change2");

System.out.println("adding multiple branch section1");
System.out.println("adding multiple branch section2");
}
}
