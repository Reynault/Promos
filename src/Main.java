import model.Matiere;
import model.Promotion;
import model.personne.Enseignant;
import model.personne.Etudiant;
import model.personne.calculAnnuel.SalaireIntervenant;
import model.personne.calculAnnuel.SalaireProfesseur;

public class Main {
    public static void main(String[] args) {
        Promotion promo = new Promotion("Master", "2018 - 2019");

        promo.ajouterEtudiant(new Etudiant("Ross", "Bob", 21, "0102030"));
        promo.ajouterEtudiant(new Etudiant("Sparklez", "Captain", 26, "3620513"));
        promo.ajouterEtudiant(new Etudiant("Mouse", "Mickey", 50, "0121324"));
        promo.ajouterEtudiant(new Etudiant("Ogre", "Shrek", 17, "6542321"));

        promo.ajouterIntervenant(new Enseignant("Yes", "Dubstep", 500, new SalaireIntervenant(), new Matiere("Math")));
        promo.ajouterIntervenant(new Enseignant("Yes", "Poid", 150, new SalaireIntervenant(), new Matiere("Math")));
        promo.ajouterIntervenant(new Enseignant("Yes", "Gravite", 201, new SalaireIntervenant(), new Matiere("Info")));
        promo.ajouterIntervenant(new Enseignant("Yes", "Lunaire", 354, new SalaireIntervenant(), new Matiere("Biologie")));

        promo.ajouterProfesseur(new Enseignant("no", "Dubstep", 500, new SalaireProfesseur(), new Matiere("Info")));
        promo.ajouterProfesseur(new Enseignant("no", "Poid", 150, new SalaireProfesseur(), new Matiere("Biologie")));
        promo.ajouterProfesseur(new Enseignant("no", "Gravite", 201, new SalaireProfesseur(), new Matiere("Info")));
        promo.ajouterProfesseur(new Enseignant("no", "Lunaire", 354, new SalaireProfesseur(), new Matiere("Math")));
        promo.ajouterProfesseur(new Enseignant("no", "Amerissage", 402, new SalaireProfesseur(), new Matiere("Info")));
        promo.ajouterProfesseur(new Enseignant("no", "Alunissage", 50, new SalaireProfesseur(), new Matiere("Biologie")));

//        System.out.println(promo.afficherEnsemble());

//        System.out.println(promo.afficherUneMatiere(new Matiere("Info")));

        System.out.println(promo.afficherParMatiere());
    }
}
