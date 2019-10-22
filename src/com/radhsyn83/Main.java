package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static float kuatArus = 3;
    public static float hambatan = 12;
    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
        Hukum h = new Hukum(kuatArus, hambatan);
        h.hitungHambatan();

        System.out.println("======HUKUM OHM======");
        System.out.println("Kuat arus mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstant.");
        System.out.println();
        System.out.println("Kuat Arus : " + h.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + h.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + h.hitungHambatan() + " Volt");
    }
}
