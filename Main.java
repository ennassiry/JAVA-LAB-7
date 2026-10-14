package com.example.tp1;

public class Main {
    public static void main(String[] args) {
        Entreprise ent = new Entreprise();

        ent.ajouterEmploye(
          new EmployeHoraire("EN-NASSIRY","Mohamed", 15.0, 160)
        );
        ent.ajouterEmploye(
          new EmployeSalarie("EN-NASSIRY","MORAD", 2500.0)
        );
        ent.ajouterEmploye(
          new Vendeur("SOUFIANNE","OUGHNI", 2000.0, 500.0)
        );
        ent.ajouterEmploye(
          new EmployeHoraire("LAAR","YOUSRA", 12.0, 120)
        );

        ent.afficherPaie();
    }
}