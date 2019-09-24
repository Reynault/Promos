package model.personne;

import model.Matiere;

public class Intervenant extends Enseignant{

    public Intervenant(String nom, String prenom, Matiere matiere, int nbHeure) {
        super(nom, prenom, matiere, nbHeure);
    }

    @Override
    public int calculerSA() {
        return getNbHeure() * getSalaireHoraire();
    }
}
