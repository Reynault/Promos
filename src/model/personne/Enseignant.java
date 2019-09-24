package model.personne;

import model.Matiere;
import model.personne.calculAnnuel.SalaireAnnuel;

public class Enseignant extends Personne{

    private static int salaireHeure = 30;
    private int nbHeures;
    private SalaireAnnuel sa;
    private Matiere m;

    public Enseignant(String nom, String prenom, int nbHeures, SalaireAnnuel sa, Matiere m) {
        super(nom, prenom);
        this.nbHeures = nbHeures;
        this.sa = sa;
        this.m = m;
    }

    public int calculSA(SalaireAnnuel sa){
        return sa.calculerSA(salaireHeure, nbHeures);
    }

    @Override
    public boolean possedeMatiere(Matiere m) {
        return this.m.equals(m);
    }

    @Override
    public Matiere getMatiere() {
        return m;
    }

    @Override
    public String afficher() {
        return getPrenom() + " " + getNom() + " en " + m.getNom() + " , salaire = " + calculSA(sa);
    }

    public static int getSalaireHeure() {
        return salaireHeure;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public Matiere getM() {
        return m;
    }
}
