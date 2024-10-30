package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AchatPdtPAge {

	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[1]")

     WebElement taille;

    @FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span")
    
    WebElement color;
    
    @FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a[2]")
    
    WebElement Ajout;
    
    @FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
    WebElement panier;
    
    @FindBy (xpath="/html/body/div[4]/div[4]/div[4]/div/div/main/article/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/div/a")
    WebElement verifypanier;
    
   public AchatPdtPAge () {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void clickonproducts () throws Exception{
		
		Thread.sleep(4000);
		
		taille.click();
		
		Thread.sleep(4000);
		color.click();
		
		Thread.sleep(4000);
		Ajout.click();
		
		Thread.sleep(4000);
		panier.click();
		
		
		
	}
	public void  verifypanierTitles (String submenutiles) {
		 Config.attents(10);

		String verifypanierTilesTex= verifypanier.getText();
	
	Assert.assertTrue(verifypanierTilesTex, true);
	
}
}