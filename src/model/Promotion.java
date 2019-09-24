package model;

import model.personne.Personne;

import java.util.ArrayList;
import java.util.List;

public class Promotion {

    private List<Personne> etudiants;
    private List<Personne> intervenants;
    private List<Personne> professeurs;
    private List<Matiere> matieres;

    private String nom;
    private String date;

    public Promotion(String nom, String date) {
        this.nom = nom;
        this.date = date;
        etudiants = new ArrayList<>();
        intervenants = new ArrayList<>();
        professeurs = new ArrayList<>();
        matieres = new ArrayList<>();
    }

    public void ajouterEtudiant(Personne e){
        etudiants.add(e);
    }

    public void ajouterIntervenant(Personne i){
        intervenants.add(i);
        verifierMatiere(i.getMatiere());
    }

    public void ajouterProfesseur(Personne p){
        professeurs.add(p);
        verifierMatiere(p.getMatiere());
    }

    public void verifierMatiere(Matiere m){
        if(m != null && ! matieres.contains(m)){
            matieres.add(m);
        }
    }

    public String afficher(){
        return "Promo "+nom+" "+date;
    }

    public String afficherEnsemble(){
        StringBuilder sb = new StringBuilder();
        sb.append(afficher());
        sb.append("\nLes etudiants : ");
        for(Personne p : etudiants){
            sb.append("\n  "+p.afficher());
        }
        sb.append("\nLes intervenants : ");
        for(Personne p : intervenants){
            sb.append("\n  "+p.afficher());
        }
        sb.append("\nLes professeurs : ");
        for(Personne p : professeurs){
            sb.append("\n  "+p.afficher());
        }
        return sb.toString();
    }

    public String afficherUneMatiere(Matiere m){
        StringBuilder sb = new StringBuilder();
        sb.append("Matiere : "+m.getNom());
        parcoursEnseignantMatiere(m, "intervenants", intervenants, sb);
        parcoursEnseignantMatiere(m, "professeurs", professeurs, sb);
        return sb.toString();
    }

    private void parcoursEnseignantMatiere(Matiere m, String type, List<Personne> liste, StringBuilder sb){
        sb.append("\nLes "+type+" en "+m.getNom());
        for(Personne p : liste){
            if (p.possedeMatiere(m)) {
                sb.append("\n  " + p.afficher());
            }
        }
    }

    public String afficherParMatiere(){
        StringBuilder sb = new StringBuilder();

        sb.append(afficher());
        for(Matiere m : matieres){
            parcoursEnseignantMatiere(m, "intervenants", intervenants, sb);
            parcoursEnseignantMatiere(m, "professeurs", professeurs, sb);
        }

        return sb.toString();
    }
}
