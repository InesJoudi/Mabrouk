package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class CandBMabroukPage {

	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	
	List <WebElement>Product;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	
	WebElement identify;
	
	
	public CandBMabroukPage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickonproduct(String productTitle) throws Exception{
		Thread.sleep(4000);
		try {
			
			for (WebElement Products:Product){
				Config.attents(10);
				
				if (Products.getText().contains(productTitle)) {
					
					Products.click();
		
	}
	
			}
		}catch (Exception e){
			
		}
	}
	
	public void indentifyTitles (String submenutile) {
		 Config.attents(10);

		String indentifyTitlesTex= identify.getText();
		
		Assert.assertEquals(submenutile, indentifyTitlesTex);
	
	}
	
	
	
	
	
}
