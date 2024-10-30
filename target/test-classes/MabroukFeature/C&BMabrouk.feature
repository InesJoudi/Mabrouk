#Author: Ines Joudi
Feature: Chemises & Blouses

  Scenario: Selection dun pdt
    Given acceder a la page du Chemises & Blouses
    When utilisateur clique sur le pdt "CHEMISE ILES"
    Then utilisateur se dirige vers CHEMISE ILES et verifie le message "CHEMISE ILES"
