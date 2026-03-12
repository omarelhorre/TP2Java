package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.println("entrer les coordonnées du point 1 (x, y): ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        Point A = new Point(x,y);
        System.out.println("entrer les coordonnées du point 2 (x, y): ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        Point B = new Point(x,y);
        System.out.println("entrer les coordonnées du point 3 (x, y): ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        Point C = new Point(x,y);
        System.out.println("detailles de A"+ A.toString());
        System.out.println("detailles de B"+ B.toString());
        System.out.println("detailles de C"+ C.toString());
        System.out.println("Distance entre point B et A est: "+ A.calculerDistance(B));
        System.out.println("Distance entre point C et A est: "+ A.calculerDistance(C));
        System.out.println("Distance entre point B et C est: "+ B.calculerDistance(C));
        TroisPoints tri = new TroisPoints(A,B,C);
        System.out.println(tri.estIsocele() ? "les trois points bien formenet un triangle isoèle" :"les trois points ne forment pas un triangle isoèle");
        System.out.println(tri.sontAlignes() ? "les trois points sont alignés" :"les trois points ne sont pas alignés");
    }
}
