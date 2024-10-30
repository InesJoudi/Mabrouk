#Author: Ines Joudi
Feature: MabroukHome

  Scenario: acceder au different menu
    Given acceder a la page dacceuil de mabrouk
    When utilisateur survol la souris sur le menu "Femme" et clique sur le sousmenu "Chemises & Blouses"
    Then utilisateur se dirige vers Chemises & Blouses et verifie le message "Chemises & Blouses"
