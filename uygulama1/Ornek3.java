package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        float yazili1,yazili2,ortalama;
        Scanner oku= new Scanner(System.in);

        System.out.println("Yazılı 1 Gir");
        yazili1=oku.nextInt();

        System.out.println("yazılı 2 Gir");
        yazili2=oku.nextInt();

        ortalama=(yazili1+yazili2)/2;


        System.out.println("Ortalama:"+ortalama);

    }
}
