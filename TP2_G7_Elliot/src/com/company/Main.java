package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel exercice voulez vous faire ? : ");
        int choix = scanner.nextInt();
        System.out.println("1. Discriminant");
        System.out.println("2. Parité d’un nombre");
        System.out.println("3. Calcul d’extremum");
        System.out.println("4. Égalité entre deux chaînes de caractères");
        System.out.println("5. Factorielle");
        System.out.println("6. Compte à rebours en 10");
        System.out.println("7. Valeurs de carrés");
        System.out.println("8. Table de multiplication");
        System.out.println("9. Division d’entiers");
        System.out.println("10. Règle graduée");
        System.out.println("11. Nombres premiers");
        System.out.println("12. Manipulations dans un tableau");
        switch(choix){
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                min();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
        }
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        double delta = (Math.pow(b, 2) - 4 * a * c);


        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle, calcul de la solution complexe : ");
            double real_part = -b / (2 * a);
            double complex_part = Math.sqrt(-delta) / (2 * a);
            System.out.println("La solution est : " + real_part + "+" + complex_part + "i");


        } else if (delta == 0) {
            float result = -b / (2 * a);
            System.out.println("La racine pour Delta nul est : " + result);


        } else if (delta > 0) {
            double resultat_1 = (-b + Math.sqrt(delta)) / (2 * a);
            double resultat_2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les racines pour Delta égal à " + delta + " sont : " + resultat_1 + " et " + resultat_2);
        }

    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de votre nombre entier ?");
        int entierVar = scanner.nextInt();
        double testParite = entierVar % 2;
        if (testParite == 0) {
            System.out.println(entierVar + " est pair");
        }
        else if (testParite != 0) {
            System.out.println(entierVar + " est impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une valeur de votre premier nombre entier");
        int nombre1 = scanner.nextInt();
        System.out.println("Donnez une valeur de votre second nombre entier");
        int nombre2 = scanner.nextInt();
        double diff = nombre1 - nombre2;
        if (diff > 0) {
            System.out.println(nombre1);
        }
        else {
            System.out.println(nombre2);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une valeur de votre premier nombre entier");
        int nombre1 = scanner.nextInt();
        System.out.println("Donnez une valeur de votre second nombre entier");
        int nombre2 = scanner.nextInt();
        double diff = nombre1 - nombre2;
        if (diff > 0) {
            System.out.println(nombre2);
        }
        else {
            System.out.println(nombre1);
        }
    }



    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une première chaine de charactères");
        String valeur_1 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Donnez une deuxème chaine de charactères");
        String valeur_2 = scanner.nextLine();
        scanner.nextLine();

        if (valeur_1.equals(valeur_2)) {
            System.out.println("Aucune différence");

        }
        else {
            System.out.println("Les deux chaînes sont différentes");
        }
    }


    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        long nbfactorielle = 1;
        long resultat = 0;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                nbfactorielle *= i;
                System.out.println("i : " + i + " and factorielle : " + nbfactorielle);
                if (nbfactorielle == 0) {
                    System.out.println("Le nombre est trop long");
                    break;
                }
            }
        }
        System.out.println(n + "! = " + resultat);
    }


    public static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("BIM BAM BOUM");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une valeur d'un nombre entier");
        int nombre1 = scanner.nextInt();
        int nombre2 = nombre1 * nombre1;
        System.out.println(nombre1 + "    " + nombre2);
    }


    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i);
                System.out.print('\t');
            }
            System.out.println();
        }
    }


    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une valeur de votre numerateur");
        int numerateur = scanner.nextInt();
        int denominateur;
        do {
            System.out.println("Saisir une valeur de votre denominateur");
            denominateur = scanner.nextInt();
        } while (denominateur == 0);

        System.out.println(numerateur / denominateur);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int longueur;
        do {
            System.out.print("Saisir la longueur de votre regle : ");
            longueur = scanner.nextInt();
        } while (longueur <= 0);
        String dash = "-";
        for (int i = 0; i <= longueur; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int nombreprem;

        do {
            System.out.print("Quelle est votre nombre ? : ");
            nombreprem = scanner.nextInt();
        } while (nombreprem <= 0);
        int diviseurs = 0;
        for (int i = 1; i <= nombreprem; i++) {
            if (nombreprem % i == 0) {
                diviseurs++;
            }
        }
        if (diviseurs == 2) {
            System.out.println(nombreprem + " est premier");
        } else {
            System.out.println(nombreprem + " n'est pas premier");
        }

    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        int minValeur = tableau[0];
        int maxValeur = tableau[0];
        int somme = tableau[0];
        StringBuilder pairs = new StringBuilder();
        StringBuilder indicePairs = new StringBuilder();

        for (int i = 1; i < tableau.length; i++) {
            int currentValue = tableau[i];
            somme += currentValue;
            double diffMin = minValeur - currentValue;
            double diffMax = maxValeur - currentValue;
            if (diffMin > 0) {
                minValeur = tableau[i];
            }
            if (diffMax < 0) {
                maxValeur = tableau[i];
            }
            if (currentValue % 2 == 0) {
                pairs.append(currentValue);
                pairs.append('\t');
            }
            if (i % 2 == 0) {
                indicePairs.append(currentValue);
                indicePairs.append('\t');
            }
        }
        System.out.println("Max : " + maxValeur + " et Min : " + minValeur + " et somme : " + somme) ;
        System.out.println("Elements pairs : " + pairs);
        System.out.println("Elements avec indice pair : " + indicePairs);
        System.out.println("Tableau initial : " + Arrays.toString(tableau));
        System.out.println("Tableau inverse : " + Arrays.toString(inverseTableau(tableau)));
    }

    public static int[] inverseTableau(int[] tableau){
        int[] newTableau = new int[tableau.length];
        for (int i = tableau.length-1; i >= 0; i--){
            newTableau[(tableau.length-1) - i] = tableau[i];
        }
        return newTableau;
    }
}