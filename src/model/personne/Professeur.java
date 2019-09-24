package model.personne;

import model.Matiere;

public class Professeur extends Enseignant{

    public Professeur(String nom, String prenom, Matiere matiere, int nbHeure) {
        super(nom, prenom, matiere, nbHeure);
    }

    @Override
    public int calculerSA() {
        int indemnite = getNbHeure() - 200;
        if(indemnite > 0){
            indemnite *= 30;
        }else{
            indemnite = 0;
        }
        return 2000 * 12 + indemnite;
    }
}
