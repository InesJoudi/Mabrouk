package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.CandBMabroukPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandBMabroukTestSuite {

	
	@Given("acceder a la page du Chemises & Blouses")
	public void acceder_a_la_page_du_chemises_blouses() {
		 Config.driver=new ChromeDriver();
			
			Config.ConfChrome();
			
			Config.maximize();
			
			String url="https://mabrouk.tn/categorie-produit/vetements-femmes/chemises-blouses/";
			
			 Config.driver.get(url);
	}

	@When("utilisateur clique sur le pdt {string}")
	public void utilisateur_clique_sur_le_pdt(String produit) throws Exception {
		CandBMabroukPage pages=new CandBMabroukPage();
		pages.clickonproduct(produit);
		
	}

	@Then("utilisateur se dirige vers CHEMISE ILES et verifie le message {string}")
	public void utilisateur_se_dirige_vers_chemise_iles_et_verifie_le_message(String sousmenu) {
		CandBMabroukPage pages= new CandBMabroukPage();
		pages.indentifyTitles(sousmenu);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
