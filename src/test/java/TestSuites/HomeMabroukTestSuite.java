package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.MabroukHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeMabroukTestSuite {

	
	@Given("acceder a la page dacceuil de mabrouk")
	public void acceder_a_la_page_dacceuil_de_mabrouk() {
       Config.driver=new ChromeDriver();
		
		Config.ConfChrome();
		
		Config.maximize();
		
		String url="https://mabrouk.tn/";
		
		 Config.driver.get(url);
	}

	@When("utilisateur survol la souris sur le menu {string} et clique sur le sousmenu {string}")
	public void utilisateur_survol_la_souris_sur_le_menu_et_clique_sur_le_sousmenu(String menus, String sousMenus) {
		MabroukHomePage page= new MabroukHomePage();
		page.mouseHoverOnMenu(menus, sousMenus);
	}

	@Then("utilisateur se dirige vers Chemises & Blouses et verifie le message {string}")
	public void utilisateur_se_dirige_vers_chemises_blouses_et_verifie_le_message(String sousMenus) {
		MabroukHomePage page= new MabroukHomePage();
		page.verifTitles(sousMenus);
	}



	
	
	
	
	
	
	
	
	
	
	
	
}
