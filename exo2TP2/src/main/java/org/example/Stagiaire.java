package org.example;

public class Stagiaire {
    private String nom;
    private float[] notes;
    static int nbStagiaire;
    static double sommeMoyenneStagiaires;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float[] getNotes() {
        return notes;
    }

    public void setNotes(float[] notes) {
        this.notes = notes;
    }

    public Stagiaire(String nom, float[] notes) {
        this.nom = nom;
        this.notes = notes;
        nbStagiaire++;
    }

    public double calculerMoyenne()
    {
        double sum = 0,moy;
        for(int i=0 ; i<notes.length ; i++)
        {
            sum = sum + notes[i];

        }
        moy = sum/notes.length;
        sommeMoyenneStagiaires = moy + sommeMoyenneStagiaires;
        return moy;
    }

    public double trouverMax()
    {
        double max = notes[0];
        for(int i=0 ; i<notes.length ; i++)
        {
            if(max < notes[i])
                max = notes[i];

        }
        return max;
    }

    public double trouverMin()
    {
        double min = notes[0];
        for(int i=0 ; i<notes.length ; i++)
        {
            if(min > notes[i])
                min = notes[i];

        }
        return min;
    }

    public static int getNbStagiaire() {
        return nbStagiaire;
    }

    public static double getSommeMoyenneStagiaires() {
        return sommeMoyenneStagiaires;
    }
}
