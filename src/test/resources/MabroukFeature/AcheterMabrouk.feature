#Author: Ines Joudi
Feature: achat

  Scenario: ajout pannier
    Given acceder a la page du CHEMISE ILES
    When utilisateur clique sur la couleur et la taille et lajoute au panier "Ajouter au panier"
    Then utilisateur accede a la page et verifie la chemise choisi "CHEMISE ILES"
