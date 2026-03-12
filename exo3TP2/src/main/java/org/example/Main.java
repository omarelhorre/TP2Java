package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Adresse address = new Adresse("Hay el farah","casablanca","90000");
        Adresse address2 = new Adresse("Hay el baraka","casablanca","90000");
        Adresse address3 = new Adresse("Hay el yousoufia","casablanca","90000");
        Adresse address4 = new Adresse("Hay el qods","casablanca","90000");
        Adresse[] addressTab = {address,address2};
        Adresse[] addressTab2 = {address3,address4};
        Personne p1 = new Personne("omar",'M',addressTab);
        Personne p2 = new Personne("kamal",'M',addressTab2);
        Personne[] personnesTab = {p1,p2};
        ListePersonnes liste1 = new ListePersonnes(personnesTab);
        liste1.findByNom("omar");
        System.out.println(liste1.findByCodePostale("90000"));
        System.out.println(liste1.countPersonneVille("casablanca"));
        p1.editPersonneNom("omar","bachir");
        p1.editPersonneVille("casablanca", "rabat");
        System.out.println(p1);

    }
}
