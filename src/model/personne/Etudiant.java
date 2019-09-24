package model.personne;

import model.Matiere;

public class Etudiant extends Personne{

    private String numEtu;
    private int age;

    public Etudiant(String nom, String prenom, String numEtu, int age) {
        super(nom, prenom);
        this.numEtu = numEtu;
        this.age = age;
    }


    @Override
    public Matiere getMatiere() {
        return null;
    }

    @Override
    public String afficher() {
        return "Etudiant "+getPrenom()+" "+getNom()+" (noEt="+numEtu+") "+age+" ans";
    }


}
