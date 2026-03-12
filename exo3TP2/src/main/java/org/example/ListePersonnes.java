package org.example;

public class ListePersonnes {
    Personne[] personnes = new Personne[10];

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public ListePersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }
    public void findByNom(String s)
    {
        boolean found = false;
        for(int i=0 ; i<personnes.length ; i++)
        {
            if(this.personnes[i].getNom().equals(s))
            {
                System.out.println(personnes[i].getNom() + " "+ personnes[i].getSexe());
                personnes[i].getAdresse();
                found = true;
                break;
            }
        }
        System.out.println(found? "Trouvé":"introuvable");
    }


    public boolean findByCodePostale(String cp)
    {
        Adresse[] tab;
        for(int i=0 ; i<personnes.length ; i++)
        {
            tab = this.personnes[i].getAdresse();
            for(int j = 0 ; j< tab.length ; j++)
            {
                if (tab[i].getCodePostal().equals(cp))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int countPersonneVille(String ville)
    {
        Adresse[] tab;
        int count = 0;
        for(int i=0 ; i<personnes.length ; i++)
        {
            tab = this.personnes[i].getAdresse();
            for(int j = 0 ; j< tab.length ; j++)
            {
                if (tab[i].getVille().equals(ville))
                {
                    count++;
                }
            }
        }
        return count;
    }



}
