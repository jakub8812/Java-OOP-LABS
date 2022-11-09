package pl.jakubserafin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        Zadanie1();
//        Zadanie2();
//        Zadanie3();
//        Zadanie4();
        Zadanie5();
//        Dlugosc();
//
//        int [][] tabA = new int[3][4];
//        double[][][] Tab3D = new double[2][4][6];
//
//        int [][] tab2D = {
//                {1, 2, 3},
//                {4, 5, 6, 7, 8, 56},
//                {7},
//        };
//
//        for (int i = 0; i < tab2D.length ; i++) {
//            for (int j = 0; j < tab2D[i].length; j++) {
//                System.out.print(tab2D[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //        double[] data;
//        data = new double[10];
//
//        double[] data1 = new double[10];
//
//        String[] slowa = new String[]{"Ala", "ma", "kota"};
//
//        int [] tab = {1, 2, 3, 4, 5, 6, 512, 51};
//
//        int[] tab1 = new int[5];
//
//        tab1[0] = 5;
//        tab1[1] = 155;
//        tab1[2] = 111;
//        tab1[3] = 12;
//        tab1[4] = 1421;
//
//        System.out.println("Element: " + tab[0]);
    }

    private static void Zadanie5() {
        Scanner scanner = new Scanner(System.in);

        int [] tab = new int[8];

        for (int i = 0; i < tab.length-1; i++) {
            System.out.println("Podaj " + i + " element tablicy: ");
            tab[i] = scanner.nextInt();
        }
        System.out.println("Trwa sortowanie tablicy...");

        for (int i = 0; i < tab.length-1; i++) {
            for (int j = 0; j < tab.length-1; j++) {
                if(tab[j] > tab[j+1]) {
                    tab[j + 1] = tab[j];
                    j++;
                }
                i++;
            } }
            for(int z:tab) {
                System.out.println(z);
            }

    }

    private static void Zadanie4() {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] tablica = new String[5];
//
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println("Podaj " + i + " element tablicy.");
//            tablica[i] = scanner.next();
//        }
//        for (String y: tablica) {
//            System.out.println(y);
        Scanner scanner = new Scanner(System.in);

        String[] slowa = new String[5];
        System.out.println("Podaj " + slowa.length + " slowa/slow: ");

        for (int i = 0; i < slowa.length; i++) {
            System.out.println((i+1) + " slowo: ");
            slowa[i] = scanner.next();
        }

        for (int i = slowa.length -1; i < 0; i--) {
            for (int j = slowa[i].length()-1; j >= 0 ; j--) {
                System.out.println(slowa[i].charAt(j));
            }
            System.out.println();
        }

    }

    private static void Zadanie3() {
        String[] tabS = {"bydgoszcz", "warszawa", "rzeszów", "katowice", "kraków", "stalowa wola"};

        for(String x: tabS) {
            System.out.println(x.toUpperCase());
        }
    }

    private static void Zadanie2() {

    }

    private static void Zadanie1() {
        int[] Tab = {2, 5, 7, 8, 9};
        int suma = 0;

        for (int i = 0; i < Tab.length; i++) {
            suma = suma + Tab[i];
        }
        System.out.println("Suma elementów to: " + suma);
        System.out.println("Średnia elementów to: " + suma / Tab.length);
    }

    public static void Dlugosc() {
        int[] liczby = new int[5];
        double[] liczbyD = new double[]{3.14, 3.52151, 1.33};

        System.out.println("Liczba elementow w tablicy: " + liczby.length);
        System.out.println("Liczba elementow w tablicy: " + liczbyD.length);
    }

    public static void Rozmiar() {
        String tekst = "tekst";
        String[] slowa = {"ala", "ma", "kota"};
        System.out.println("Liczba znakow w slowa: " + tekst.length());
        System.out.println("Liczba elementow w tablicy: " + slowa.length);
        System.out.println("Liczba znakow w pierwszym elemencie tablicy: " + slowa[0].length());
    }

    public static void For() {
        int[] tab = {12, 21, 4213, 14, 51};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void Foreach() {
        int[] tab = {1, 2, 34, 4};

        for (int i : tab) {
            System.out.println(i);
        }
    }
}
