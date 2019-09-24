import model.Matiere;
import model.Promo;
import model.personne.Etudiant;
import model.personne.Intervenant;
import model.personne.Personne;
import model.personne.Professeur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Matiere info = new Matiere("Info");
        Matiere biologie = new Matiere("Biologie");

        ArrayList<Personne> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Marley", "Bob", "06252545", 21));
        etudiants.add(new Etudiant("Presley", "Elvis", "06303550", 25));

        ArrayList<Personne> professeurs = new ArrayList<>();
        professeurs.add(new Professeur("Ross", "Bob", info, 400));
        professeurs.add(new Professeur("Jackson", "Mickael", biologie, 40));

        ArrayList<Personne> intervenant = new ArrayList<>();
        intervenant.add(new Intervenant("Doe", "John", biologie, 60));
        intervenant.add(new Intervenant("Yes", "Dubstep", info, 70));



        Promo p = new Promo("Master", "2012 - 2013");

        System.out.println(p.afficherEnseignantUneMatiere(info));
    }
}
