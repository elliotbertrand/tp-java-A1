import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        // somme();
        division();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le premier entier");
        int premierEntier = scanner.nextInt();

        System.out.println("Saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();

        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);

    }


    public static void division(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le premier entier");
        float premierEntier = scanner.nextFloat();

        System.out.println("Saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();

        float division = premierEntier / deuxiemeEntier;

        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Saisir la hauteur");
        float hauteur = scanner.nextFloat();

        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume est : " + volume);
    }


}

