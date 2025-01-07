package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> totalrows= driver.findElements(By.xpath("//*[@class='bd-example table-responsive']//tbody//tr"));
		
		int rowcount= totalrows.size();
		
		
		List<WebElement> totalcolumns= driver.findElements(By.xpath("//*[@class='bd-example table-responsive']//thead//th"));
		
		int colcount= totalcolumns.size();
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j =1;j<=colcount;j++)
			{
			  String value=	driver.findElement(By.xpath("//*[@class='bd-example table-responsive']//tbody//tr["+i+"]//td["+j+"]")).getText();
			  System.out.println(value);
			}
		}
		// TODO Auto-generated method stub

	}

}
