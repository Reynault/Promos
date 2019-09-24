package model.personne;

import model.Matiere;

public abstract class Enseignant extends Personne{

    private Matiere matiere;
    private int nbHeure;
    private static int salaireHoraire = 30;

    public Enseignant(String nom, String prenom, Matiere matiere, int nbHeure) {
        super(nom, prenom);
        this.matiere = matiere;
        this.nbHeure = nbHeure;
    }

    public String afficher(){
        return getPrenom() + " " + getNom() + " en " + matiere.afficher() + " , salaire = "+calculerSA();
    }

    public abstract int calculerSA();

    public int getNbHeure() {
        return nbHeure;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public static int getSalaireHoraire() {
        return salaireHoraire;
    }

}
