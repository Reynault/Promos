package model.personne;

import model.Matiere;

public abstract class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract boolean possedeMatiere(Matiere m);

    public abstract Matiere getMatiere();

    public abstract String afficher();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
