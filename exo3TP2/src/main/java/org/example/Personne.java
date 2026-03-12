package org.example;

import java.util.Arrays;

public class Personne {
    private String nom;
    private char sexe;
    private Adresse[] adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public Adresse[] getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse[] adresse) {
        this.adresse = adresse;
    }

    public Personne(String nom, char sexe, Adresse[] adresse) {
        this.nom = nom;
        this.sexe = sexe;
        this.adresse = adresse;
    }

 public void editPersonneNom(String oldNom, String newNom)
    {
        if(this.nom.equals(oldNom))
        {
            setNom(newNom);

        }
    }

    public void editPersonneVille(String nom, String newVille)
    {
        Adresse[] tab;
        tab = getAdresse();
        for(int i = 0 ; i<getAdresse().length ; i++)
        {
            if(tab[i].getVille().equals(nom))
                tab[i].setVille(newVille);
        }
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", sexe=" + sexe +
                ", adresse=" + Arrays.toString(adresse) +
                '}';
    }
}


