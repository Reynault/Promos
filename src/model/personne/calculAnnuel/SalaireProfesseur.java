package model.personne.calculAnnuel;

public class SalaireProfesseur implements SalaireAnnuel {

    @Override
    public int calculerSA(int salaireHoraire, int nbHeures) {
        int indemnite = nbHeures - 200;
        if (indemnite > 0){
            indemnite *= 30;
        }else{
            indemnite = 0;
        }
        return 2000 * 12 + indemnite;
    }
}
