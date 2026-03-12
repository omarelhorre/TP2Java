package org.example;

import java.text.Format;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float[] arr = {10,30,1,2};
        float[] arr2 = {20,40,2,0};
        float[] arr3 = {20,100,2,0};
        Stagiaire test = new Stagiaire("test",arr);
        Stagiaire test2 = new Stagiaire("test2",arr2);
        Stagiaire test3 = new Stagiaire("test3",arr3);
        Stagiaire[] tableS = {test,test2,test3};

        Formation testF = new Formation("0",30,tableS);
        System.out.println("moynne= "+ test.calculerMoyenne());
        System.out.println("max= "+ test.trouverMax());
        System.out.println("max= "+ test.trouverMin());

        System.out.println("moynne= "+ test2.calculerMoyenne());
        System.out.println("max= "+ test2.trouverMax());
        System.out.println("max= "+ test2.trouverMin());

        System.out.println("moynne= "+ test3.calculerMoyenne());
        System.out.println("max= "+ test3.trouverMax());
        System.out.println("max= "+ test3.trouverMin());


        System.out.println("la moyenne des moyennes est " + testF.calculerMoyenneFormation());
        System.out.println("l'indice du stagiaire ayant une note maximale est " + testF.getIndexMax());
        System.out.println("le premier stagiaire est " + testF.afficherNomMax() );
        System.out.println("le derniere stagiaire est " + testF.afficherMinMax() );

        Scanner scan = new Scanner(System.in);
        String look = scan.nextLine();
        System.out.println("la moyenne est " + testF.trouverMoyenneParNom(look) );

    }
}
