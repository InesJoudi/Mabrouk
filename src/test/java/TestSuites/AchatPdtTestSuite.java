package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.AchatPdtPAge;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AchatPdtTestSuite {

	@Given("acceder a la page du CHEMISE ILES")
	public void acceder_a_la_page_du_chemise_iles() {
		 Config.driver=new ChromeDriver();
			
			Config.ConfChrome();
			
			Config.maximize();
			
			String url="https://mabrouk.tn/produit/chemise-iles/";
			
			 Config.driver.get(url);
	}

	@When("utilisateur clique sur la couleur et la taille et lajoute au panier {string}")
	public void utilisateur_clique_sur_la_couleur_et_la_taille_et_lajoute_au_panier(String panier) throws Exception{
		AchatPdtPAge x =new AchatPdtPAge();
		x.clickonproducts();
		
	}

	@Then("utilisateur accede a la page et verifie la chemise choisi {string}")
	public void utilisateur_accede_a_la_page_et_verifie_la_chemise_choisi(String y) {
		AchatPdtPAge x =new AchatPdtPAge();
		x.verifypanierTitles(y);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
