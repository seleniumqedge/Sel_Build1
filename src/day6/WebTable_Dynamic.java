package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Dynamic {

	public static void main(String[] args) {
		
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.timeanddate.com/worldclock/");
		dr.manage().window().maximize();

		// identify webtable
	 WebElement	table=dr.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		// identify rows from webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
				System.out.println(rows.size());  
				
				// loop for rows
				for (int i = 0; i < rows.size(); i++) 
				{
					// identify columns from row
					List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
					System.out.println(cols.size());
					
					// loop for columns
					for (int j = 0; j < cols.size(); j++) 
					{
						String names=cols.get(j).getText();
						System.out.print(names+"   ");
					}
					
					System.out.println();
				}
	}

}
