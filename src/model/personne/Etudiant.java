package model.personne;

import model.Matiere;

public class Etudiant extends Personne{
    private int age;
    private String noEt;

    public Etudiant(String nom, String prenom, int age, String noEt) {
        super(nom, prenom);
        this.age = age;
        this.noEt = noEt;
    }

    @Override
    public boolean possedeMatiere(Matiere m) {
        return false;
    }

    @Override
    public Matiere getMatiere() {
        return null;
    }

    @Override
    public String afficher() {
        return "Etudiant "+getPrenom() + " " + getNom() + " (noEt=" + noEt + ")" + age + " ans";
    }

    public int getAge() {
        return age;
    }

    public String getNoEt() {
        return noEt;
    }
}
