package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MabroukHomePage {

	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li/a/span")
	
	List<WebElement>menu;
	
	@FindBy(xpath="/html/body/div[4]/header/div/div/div[2]/nav/div/div[3]/div[1]/ul/li[4]/div/ul/li/a/span")
	
	List<WebElement>sousMenu;
	
	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	
	WebElement verifs;
	
	public MabroukHomePage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void mouseHoverOnMenu(String menutitle, String submenutitle) {
		
		try {
			for(WebElement menus:menu) {
				Config.attents(10);
				if (menus.getText().contains(menutitle)) {
					
					Config.actions= new Actions (Config.driver);
					Config.actions.moveToElement(menus).perform();
			for(WebElement sousMenus:sousMenu)	{
				Config.attents(10);
				if (sousMenus.getText().contains(submenutitle)) {
					sousMenus.click();
				}
					
				
			}
											
		}
	}
		}catch (Exception e){
	}	
}
	
	public void verifTitles (String submenutile) {
		Config.attents(10);
		String verifTitlesTex=verifs.getText();
		
		Assert.assertEquals(submenutile, verifTitlesTex);
	}
}
	