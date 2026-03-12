package org.example;

public class Formation {
    private String intitule;
    private int nbJours;
    private Stagiaire[] stagiaire;

    public String getIntitule() {
        return intitule;
    }

    public Formation(String intitule, int nbJours, Stagiaire[] stagiaire) {
        this.intitule = intitule;
        this.nbJours = nbJours;
        this.stagiaire = stagiaire;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }


    public Stagiaire[] getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Stagiaire[] stagiaire) {
        this.stagiaire = stagiaire;
    }

    public double calculerMoyenneFormation()
    {
        return Stagiaire.getSommeMoyenneStagiaires() / Stagiaire.getNbStagiaire();
    }
    public int getIndexMax(){
        double max = stagiaire[0].trouverMax();
        int index = 0;
        for(int i = 0 ; i<stagiaire.length; i++)
            {
                if(stagiaire[i].trouverMax()> max)
                {
                    max = stagiaire[i].trouverMax();
                    index = i;
                }
            }
        return index;
    }

    public String afficherNomMax(){
        double max = stagiaire[0].trouverMax();
        String nom ="";
        for(int i = 0 ; i<stagiaire.length; i++)
        {
            if(stagiaire[i].trouverMax()> max)
            {
                max = stagiaire[i].trouverMax();
                nom = stagiaire[i].getNom();
            }
        }
        return nom;
    }
    public String afficherMinMax(){
        double min = stagiaire[0].trouverMax();
        String nom ="";
        for(int i = 0 ; i<stagiaire.length; i++)
        {
            if(stagiaire[i].trouverMin() < min)
            {
                min = stagiaire[i].trouverMax();
                nom = stagiaire[i].getNom();
            }
        }
        return nom;
    }
    public double trouverMoyenneParNom(String nom)
    {
        for(int i=0 ; i< stagiaire.length ; i++)
        {
            if (stagiaire[i].getNom().equals(nom))
            {
                return stagiaire[i].calculerMoyenne();
            }
        }
        return -1;
    }


}
