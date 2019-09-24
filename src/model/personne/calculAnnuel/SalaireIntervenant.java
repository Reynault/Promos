package model.personne.calculAnnuel;

public class SalaireIntervenant implements SalaireAnnuel {
    @Override
    public int calculerSA(int salaireHoraire, int nbHeures) {
        return nbHeures * salaireHoraire;
    }
}
