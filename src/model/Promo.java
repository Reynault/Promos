package model;

import model.personne.Etudiant;
import model.personne.Personne;

import java.util.ArrayList;
import java.util.List;

public class Promo {

    private List<Personne> etudiants;
    private List<Personne> professeurs;
    private List<Personne> intervenants;
    private List<Matiere> matieres;
    private String nom;
    private String date;

    public Promo(String nom, String date) {
        this.etudiants = new ArrayList<>();
        this.professeurs = new ArrayList<>();
        this.intervenants = new ArrayList<>();
        this.matieres = new ArrayList<>();
        this.nom = nom;
        this.date = date;
    }

    public void ajouterProfesseur(Personne p){
        professeurs.add(p);
        ajouterMatiere(p.getMatiere());
    }

    public void ajouterEtudiant(Personne e){
        etudiants.add(e);
    }

    private void ajouterMatiere(Matiere matiere){
        if(!matieres.contains(matiere)){
            matieres.add(matiere);
        }
    }

    private void containsMatiere(Matiere matiere){
        if(matiere != null && matieres.contains(matiere)){
            
        }
    }

    public void ajouterIntervenant(Personne i){
        intervenants.add(i);
        ajouterMatiere(i.getMatiere());
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public String afficherPromo(){
        return "Promo "+nom+" "+date;
    }

    public String afficher() {
        StringBuilder res = new StringBuilder();
        res.append(afficherPromo()+"\nLes etudiants :");

        for(Personne p : etudiants){
            res.append("\n " + p.afficher());
        }

        res.append("\nLes professeurs :");

        for(Personne p : professeurs){
            res.append("\n "+p.afficher());
        }

        res.append("\nLes intervenants :");

        for(Personne p : intervenants){
            res.append("\n "+p.afficher());
        }

        return res.toString();
    }

    public String afficherEnseignantUneMatiere(Matiere matiere){
        StringBuilder sb = new StringBuilder();

        sb.append("\nMatiere : "+matiere.getNom());
        sb.append("\nLes professeurs en "+matiere.getNom()+":");

        Matiere m;
        for(Personne p : professeurs){
            m = p.getMatiere();
            if (p != null && matieres.contains) {
                sb.append("\n " + p.afficher());
            }
        }

        sb.append("\nLes intervenants en "+matiere.getNom()+" :");
        for(Personne p : intervenants){
            if (p.possedeMatiere(matiere)) {
                sb.append("\n " + p.afficher());
            }
        }

        return sb.toString();
    }

    public String afficherEnseignantParMatiere(String matiere){
        StringBuilder sb = new StringBuilder();
        


        return "";
    }

    public List<Personne> getEtudiants() {
        return etudiants;
    }

    public List<Personne> getProfesseurs() {
        return professeurs;
    }

    public List<Personne> getIntervenants() {
        return intervenants;
    }
}
